package main.java.domain;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private String doctorId;
	private Speciality speciality;
	private List<Appointment> appointments;
	public Doctor(String doctorId, Speciality speciality) {
		super();
		this.doctorId = doctorId;
		this.speciality = speciality;
		appointments=new ArrayList();
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
}
