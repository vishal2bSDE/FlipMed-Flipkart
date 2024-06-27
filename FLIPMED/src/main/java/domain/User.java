package main.java.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

	private String userId;
	private List<Appointment> appointments;
	private Set<String> slotsBooked;
	public User(String userId) {
		super();
		this.userId = userId;
		appointments=new ArrayList();
		slotsBooked=new HashSet();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	public Set<String> getSlotsBooked() {
		return slotsBooked;
	}
	public void setSlotsBooked(Set<String> slotsBooked) {
		this.slotsBooked = slotsBooked;
	}
	public void addNewSlot(String slotId) {
		this.slotsBooked.add(slotId);
	}
	public void addNewSlot(Appointment appointment) {
		this.appointments.add(appointment);
	}
	
}
