package model.person;

import java.util.ArrayList;



public class PatientCatalog {
	
	 ArrayList<Patient> patientList; 
	    public PatientCatalog(){
	    	patientList = new ArrayList();
	     
	    }

	    public ArrayList<Patient> getPatientList(){
	        return patientList;
	    }
	 
	    public Patient newPatient(Patient v){
	    	
	    	patientList.add(v);
	        return v;
	    }

	    public int getPatientIdByName(String n){
	        
	        for( Patient p: patientList){
	            
	            if(p.getName().equals(n)) return p.getId();
	        }
			return 0;
	        
	    }
	    
	    
	    public Patient getPatientByName(String n){
	        
	        for( Patient p: patientList){
	            
	            if(p.getName().equals(n)) return p;
	        }
			return null;
	        
	    }
	    
	    public int getLastPatientId() {
	    	
	    	if(patientList.size()==0) {
	    		return 0;
	    	}else {
	    		return patientList.get(patientList.size()).getId();
	    	}
	    		
			
	    	
	    }
	    
	    public void deletePatient(String name) {
	    	int index =0;
	    	for (int i = 0; i < patientList.size(); i++) {
	    		if(patientList.get(i).getName().equals(name)) {
	    			index =i;
	    		}
			}
	    	patientList.remove(index);
	    }

}
