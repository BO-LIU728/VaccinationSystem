package model.vaccine;

import java.util.ArrayList;

import model.person.Patient;

public class VaccineCatalog {
	ArrayList<Vaccine> vaccineList; 
    public VaccineCatalog(){
    	vaccineList = new ArrayList();
     
    }

    public ArrayList<Vaccine> getVaccineList(){
        return vaccineList;
    }
 
    public Vaccine newVaccine(Vaccine v){
    	
    	vaccineList.add(v);
        return v;
    }

    public int getVaccineIdByName(String n){
        
        for( Vaccine p: vaccineList){
            
            if(p.getName().equals(n)) return p.getId();
        }
		return 0;
        
    }
    
    
    public Vaccine getVaccineByName(String n){
        
        for( Vaccine p: vaccineList){
            
            if(p.getName().equals(n)) return p;
        }
		return null;
        
    }
    
    public void updateVaccine(String name,String newName,int num) {
    	
    	for (int i = 0; i < vaccineList.size(); i++) {
    		if(vaccineList.get(i).getName().equals(name)) {
    		
    			vaccineList.get(i).setName(newName);
    			vaccineList.get(i).setNum(num);
    		}
		}
    	
    }
    
    public int getLastVaccineId() {
    	
    	if(vaccineList.size()==0) {
    		return 0;
    	}else {
    		return vaccineList.get(vaccineList.size()).getId();
    	}
    		
		
    	
    }
    
    public void deleteVaccine(String name) {
    	int index =0;
    	for (int i = 0; i < vaccineList.size(); i++) {
    		if(vaccineList.get(i).getName().equals(name)) {
    			index =i;
    		}
		}
    	vaccineList.remove(index);
    }

}
