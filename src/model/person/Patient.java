package model.person;

import java.util.ArrayList;

import model.other.Appointment;
import model.other.Authentication;

public class Patient extends Person{
	private int id;
	private String name;
	private String allergy;
	private ArrayList<Appointment> PatientAppointments;
	private ArrayList<Authentication> PatientAuthentications;
	
	public Patient(String name,String allergy,int id) {
		super(name) ;
		this.name= super.getName();
		this.id=id;
		this.allergy =allergy;
		PatientAppointments =new ArrayList<Appointment>();
		PatientAuthentications=new ArrayList<Authentication>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public ArrayList<Appointment> getAppointments() {
		return PatientAppointments;
	}



	public ArrayList<Authentication> getAuthentications() {
		return PatientAuthentications;
	}

	public void setAuthentications(ArrayList<Authentication> authentications) {
		this.PatientAuthentications = authentications;
	}
	
    public Appointment newAppointment(Appointment a){
    	
    	PatientAppointments.add(a);
        return a;
    }

    
 public Authentication newAuthentication(Authentication a){
    	
    	PatientAuthentications.add(a);
        return a;
    }

 
 	public Authentication  showAuthentication(String vaccineName){
 		for (Authentication authentication : PatientAuthentications) {
 			
 			if(authentication.getVaccineName().equals(vaccineName)){
 				System.out.println(authentication);
 				return authentication;
 			}
			
		}
		return null;
 	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", allergy=" + allergy + "]";
	}
	



	
	
	
}
