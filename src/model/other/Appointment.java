package model.other;

import model.medical.Doctor;
import model.medical.Nurse;

public class Appointment {
	
	private String date;
	private String doctorName;
	private String nurseName;
	public Appointment(String date, String doctorName, String nurseName) {
		super();
		this.date = date;
		this.doctorName = doctorName;
		this.nurseName = nurseName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getNurseName() {
		return nurseName;
	}
	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	
	
	
	

}
