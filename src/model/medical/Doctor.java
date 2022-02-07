package model.medical;

import model.person.Patient;
import model.person.Person;

public class Doctor  extends Stuff{

	public Doctor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	


	public int medicalScreen(Patient p) {
		if(p.getAllergy().equals("none")){
			System.out.println("Doctor-----no problem, go to the nurse and get vaccinated");
			return 1;
		}else {
			System.out.println("Doctor-----you have an allergic reaction, so you cannot get vaccinated");
			return 0;
		}
		
	}

}
