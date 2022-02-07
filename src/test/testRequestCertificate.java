package test;

import model.medical.Doctor;
import model.medical.Nurse;
import model.other.Appointment;
import model.other.Authentication;
import model.person.Patient;
import model.person.PatientCatalog;
import model.vaccine.Vaccine;
import model.vaccine.VaccineCatalog;
import util.DateUtil;

public class testRequestCertificate {
	static VaccineCatalog vc =new VaccineCatalog();
	static PatientCatalog pc =new PatientCatalog();
	static String hospitalName = "central hospital";
	

	
	public static void addData(){
		
		//data
		String name1 ="rabies vaccine";
		Vaccine v1 =new Vaccine(vc.getLastVaccineId()+1, name1, 1000);
		
		
		String name2 ="covid-19 vaccine";
		Vaccine v2 =new Vaccine(vc.getLastVaccineId()+2,name2 , 1000);

		vc.newVaccine(v1);
		vc.newVaccine(v2);
	}
	
	static{
		addData();
	}
	//Test method that all conditions are normal
	public static void main(String[] args) {

		
		//1.Person identity definition
		Patient p =new Patient("David", "none", pc.getLastPatientId()+1);
		
		
		//appointment
		Appointment p1a =new Appointment(DateUtil.getDate(), "Tom", "Jimmy");
		
		Doctor tom =new Doctor("Tom");
	
		
		int status =tom.medicalScreen(p);
		if(status==0){
			return;
			
		}else{
			Nurse n =new Nurse("Jimmy");
			
			
			String patientVaccine  ="covid-19 vaccine";
			//2.including vaccine inventory management,vaccination happens at someplace and sometime, issue certification
			n.administration(p,hospitalName,vc,patientVaccine);
			
			
		}
		String name ="covid-19 vaccine";
		//3.show the certification
		System.out.println("please show your "+name+" vaccineAuthentication");
			Authentication a =p.showAuthentication(name);
			if(a!=null){
				System.out.println("ok!please");
			}else{
				System.out.println(p.getName()+",sorry! you have no this Authentication ");
			}
	}

}
