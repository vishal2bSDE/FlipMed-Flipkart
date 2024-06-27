package main.java.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.java.domain.Appointment;
import main.java.domain.Doctor;
import main.java.domain.Hospital;
import main.java.domain.Speciality;
import main.java.domain.User;

public class HospitalService {

	private Hospital hospital;
	
	
	
	public HospitalService() {
		super();
		hospital=new Hospital();
	}

	public void registerDoctor(String doctorId, Speciality speciality) {
		System.out.println("Registering Doctor started");
		Doctor dr=new Doctor(doctorId, speciality);
		if(!hospital.getSpecialityDoctorMap().containsKey(speciality))hospital.getSpecialityDoctorMap().put(speciality, new ArrayList());
		hospital.getDoctors().put(doctorId, dr);
	}
	
	public void registerUser(String userId) {
		System.out.println("Registering User started");
		User user=new User(userId);
		hospital.getUsers().put(userId, user);
	}

	public void addSlotsForDoctor(String doctorId, List<String> slots) {
		System.out.println("Adding slots to doctor started, "+doctorId);
		hospital.getDoctorSlotsMap().put(doctorId, new HashSet(slots));
	}

	public void searchSpeciality(Speciality speciality) {
//		Map<String, List<String>>
		System.out.println("Printing slot and doctor for speciality, "+speciality);
		List<String> doctors=hospital.getSpecialityDoctorMap().get(speciality);
		for(String dr: doctors) {
			Set<String> slotsAttend = new HashSet(hospital.getDoctorSlotsMap().get(dr));
			Set<String> slotsOccupied = hospital.getDoctorSlotsOccupiedMap().get(dr);
			slotsAttend.removeAll(slotsOccupied);
			if(slotsAttend.isEmpty()) continue;
			for(String slot: slotsAttend) {
				System.out.println(dr +" - "+slot+" - "+speciality);
			}
		}
	}

	public void bookAppointment(String userId, String doctorId, String slotId) {
		System.out.println("Slot booking started, "+userId+" - "+slotId);
		User user = hospital.getUsers().get(userId);
		Set<String> doctorSlots = hospital.getDoctorSlotsMap().get(doctorId);
		Doctor dr= hospital.getDoctors().get(doctorId);
		if(!doctorSlots.contains(slotId) && user.getSlotsBooked().contains(slotId)) {
			System.out.println("Slot cant be booked, "+userId+" - "+slotId);
			return;
		}
		
		dr.getAppointments().add(new Appointment(userId, doctorId, dr.getSpeciality().toString(), slotId));
		user.getAppointments().add(new Appointment(userId, doctorId, dr.getSpeciality().toString(), slotId));
		doctorSlots.remove(slotId);
		user.getSlotsBooked().add(slotId);
		System.out.println("Slot booking successfull, "+userId+" - "+slotId);
	}

	public void printUserAppointments(String userId) {
		System.out.println("Printing appointments for user, "+userId);
		for(Appointment a : hospital.getUsers().get(userId).getAppointments()) {
			System.out.println(a.toString());
		}
	}

	public void printDoctorAppointments(String doctorId) {
		System.out.println("Printing appointments for doctor, "+doctorId);
		for(Appointment a : hospital.getDoctors().get(doctorId).getAppointments()) {
			System.out.println(a.toString());
		}
	}
}
