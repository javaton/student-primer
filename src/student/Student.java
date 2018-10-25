package student;

public class Student {

	private String imePrezime;
	private String brojIndexa;
	
	public Student() {
		
	}
	
	public Student(String imePrezime) {
		this.imePrezime = imePrezime;
		this.brojIndexa = "0/2018"; 
	}
	
	public Student(String imePrezime, String brojIndexa) {
		this.imePrezime = imePrezime;
		this.brojIndexa = brojIndexa; 
	}
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	
	
}
