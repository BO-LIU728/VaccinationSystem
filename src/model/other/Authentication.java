package model.other;

public class Authentication {
	private String vaccineName;
	private String hospitalName;
	private String NurseName;
	private String date;
	public Authentication(String vaccineName,String hospitalName, String nurseName,String date) {
		super();
		this.vaccineName =vaccineName;
		this.hospitalName = hospitalName;
		NurseName = nurseName;
		this.date = date;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getNurseName() {
		return NurseName;
	}
	public void setNurseName(String nurseName) {
		NurseName = nurseName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	@Override
	public String toString() {
		return "Authentication [vaccineName=" + vaccineName + ", hospitalName=" + hospitalName + ", NurseName="
				+ NurseName + ", date=" + date + "]";
	}
	
	
	

}
