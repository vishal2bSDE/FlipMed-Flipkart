package main.java.domain;

public class Appointment {
	
	private String patientId;
	private String doctorId;
	private String speciality;
	private String slotId;
	public Appointment(String patientId, String doctorId, String speciality, String slotId) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.speciality = speciality;
		this.slotId = slotId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	@Override
	public String toString() {
		return "Appointment [patientId=" + patientId + ", doctorId=" + doctorId + ", speciality=" + speciality
				+ ", slotId=" + slotId + "]";
	}
	
	
}
