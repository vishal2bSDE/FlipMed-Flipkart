package main.java;

import java.util.List;

import main.java.domain.Speciality;
import main.java.service.HospitalService;

public class Main {

	private static HospitalService hospitalService;
	public static void main(String[] args) {
		
		System.out.println("FlipMed app started");
		hospitalService = new HospitalService();
		
		registerDoctor("doctor1", Speciality.Cardiologist);
		registerDoctor("doctor2", Speciality.Dermatologist);
		registerDoctor("doctor3", Speciality.GeneralPhysician);
		registerDoctor("doctor4", Speciality.Orthopedic);
		
		declareSlotForDoctor("doctor1", List.of("slot1", "slot2", "slot3"));
		declareSlotForDoctor("doctor2", List.of("slot1", "slot2", "slot3"));
		declareSlotForDoctor("doctor3", List.of("slot1", "slot2", "slot3"));
		
		registerUser("user1");
		registerUser("user2");
		registerUser("user3");
		registerUser("user4");
		
		searchSpeciality(Speciality.Orthopedic);
		searchSpeciality(Speciality.Cardiologist);
		searchSpeciality(Speciality.Dermatologist);
		searchSpeciality(Speciality.GeneralPhysician);
		
		bookAppointment("user1", "doctor1", "slot1");
		bookAppointment("user1", "doctor1", "slot1");
		bookAppointment("user1", "doctor1", "slot1");
		bookAppointment("user1", "doctor1", "slot1");
		
		printUserAppointments("user1");
		printUserAppointments("user2");
		
		printDoctorAppointments("doctor1");
		System.out.println("FlipMed app stopped");
	}

	private static void printDoctorAppointments(String doctorId) {
		hospitalService.printDoctorAppointments(doctorId);
	}

	private static void printUserAppointments(String userId) {
		hospitalService.printUserAppointments(userId);
	}

	private static void bookAppointment(String userId, String doctorId, String slotId) {
		hospitalService.bookAppointment(userId, doctorId, slotId);
		
	}

	private static void searchSpeciality(Speciality speciality) {
		hospitalService.searchSpeciality(speciality);
	}

	private static void declareSlotForDoctor(String doctorId, List<String> slots) {
		hospitalService.addSlotsForDoctor(doctorId, slots);
		System.out.println("Adding slots to doctor successfull, "+doctorId);
	}

	private static void registerUser(String userId) {
		hospitalService.registerUser(userId);
		System.out.println("Registering User successfull");
	}

	private static void registerDoctor(String doctorId, Speciality cardiologist) {
		hospitalService.registerDoctor(doctorId, cardiologist);	
		System.out.println("Registering Doctor successfull");
	}

}
