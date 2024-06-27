package main.java.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hospital {

	private Map<Speciality, List<String>> specialityDoctorMap;
	private Map<String, Set<String>> doctorSlotsMap;
	private Map<String, Set<String>> doctorSlotsOccupiedMap;
	private Map<String, Doctor> doctors;
	private Map<String, User> users;
	
	public Hospital() {
		super();
		specialityDoctorMap=new HashMap();
		doctorSlotsMap=new HashMap();
		doctorSlotsOccupiedMap=new HashMap();
		doctors=new HashMap();
		users=new HashMap();
	}
	public Map<String, User> getUsers() {
		return users;
	}
	public void setUsers(Map<String, User> users) {
		this.users = users;
	}
	public Map<String, Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(Map<String, Doctor> doctors) {
		this.doctors = doctors;
	}
	public Map<Speciality, List<String>> getSpecialityDoctorMap() {
		return specialityDoctorMap;
	}
	public void setSpecialityDoctorMap(Map<Speciality, List<String>> specialityDoctorMap) {
		this.specialityDoctorMap = specialityDoctorMap;
	}
	public Map<String, Set<String>> getDoctorSlotsMap() {
		return doctorSlotsMap;
	}
	public void setDoctorSlotsMap(Map<String, Set<String>> doctorSlotsMap) {
		this.doctorSlotsMap = doctorSlotsMap;
	}
	public Map<String, Set<String>> getDoctorSlotsOccupiedMap() {
		return doctorSlotsOccupiedMap;
	}
	public void setDoctorSlotsOccupiedMap(Map<String, Set<String>> doctorSlotsOccupiedMap) {
		this.doctorSlotsOccupiedMap = doctorSlotsOccupiedMap;
	}
	
	
}
