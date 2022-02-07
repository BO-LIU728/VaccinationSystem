package test;

import java.util.ArrayList;

import model.person.PatientCatalog;
import model.vaccine.Vaccine;
import model.vaccine.VaccineCatalog;

public class testVaccineManage {

	
	//test vaccine inventory management
	public static void main(String[] args) {
		VaccineCatalog vc =new VaccineCatalog();
		ArrayList<Vaccine> vaccineList = vc.getVaccineList();
		
		System.out.println("--------------This is addVaccine operation--------------");
		
		//addAllVaccine
		String name1 ="rabies vaccine";
		Vaccine v1 =new Vaccine(vc.getLastVaccineId()+1, name1, 1000);
		System.out.println("add "+name1+" ok!");
		
		String name2 ="covid-19 vaccine";
		Vaccine v2 =new Vaccine(vc.getLastVaccineId()+2,name2 , 1000);
		System.out.println("add "+name2+" ok!");
		vc.newVaccine(v1);
		vc.newVaccine(v2);
		//selectAllVaccine
		System.out.println();
		System.out.println();
		System.out.println("--------------This is selcetVaccineCatalog operation--------------");
		for (Vaccine vaccine : vaccineList) {
			System.out.println(vaccine);
			
		}
		
		//deleteVaccine
		System.out.println();
		System.out.println();
		System.out.println("--------------This is deleteVaccine operation--------------");
		String deleteName ="rabies vaccine";
		vc.deleteVaccine(deleteName);
		System.out.println("delete "+deleteName+" ok!");
		System.out.println();
		System.out.println("----selcetVaccineCatalog---");
		for (Vaccine vaccine : vaccineList) {
			System.out.println(vaccine);
			
		}
		//updateVaccine
		System.out.println();
		System.out.println();
		System.out.println("--------------This is updateVaccine operation--------------");
		String nowName ="covid-19 vaccine";
		String updateName ="covid-19_ vaccine";
		int num =500;
		vc.updateVaccine(nowName, updateName, num);
		System.out.println("update "+nowName+" ok!");
		System.out.println();
		System.out.println("----selcetVaccineCatalog---");
		for (Vaccine vaccine : vaccineList) {
			System.out.println(vaccine);
			
		}
	}

}
