package model.medical;

import model.other.Authentication;
import model.person.Patient;
import model.person.Person;
import model.vaccine.Vaccine;
import model.vaccine.VaccineCatalog;
import util.DateUtil;

public class Nurse  extends Stuff{
	private String nuserName;

	public Nurse(String name) {
		super(name);
		nuserName =name;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean  administration(Patient p, String hospitalName, VaccineCatalog vc, String patientVaccine) {
		if(vc.getVaccineByName(patientVaccine).getNum()==0){
			
			System.out.println("Nurse-----there is a shortage of vaccine.");
			return false;
		}else{
			//Vaccine inventory management
			vc.getVaccineByName(patientVaccine).setNum(vc.getVaccineByName(patientVaccine).getNum()-1);
			//Vaccination happens at someplace and sometime
			Authentication a =new  Authentication(patientVaccine,hospitalName, nuserName, DateUtil.getDate());
			//certification
			p.newAuthentication(a);
			System.out.println("Nurse-----After getting a shot, you will have this vaccineAuthentication ");
			return true;}

		
		
	}

	@Override
	public String toString() {
		return "Nurse [nuserName=" + nuserName + "]";
	}

	
}
