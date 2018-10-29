package profesor;

import java.util.List;

import osoba.Osoba;

public class Profesor extends Osoba {

	private String imePrezime;
	private List<String> predmeti;
	
	
	public Profesor() {
		super();
	}
	public Profesor(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}
	public Profesor(String imePrezime, List<String> predmeti) {
		super();
		this.imePrezime = imePrezime;
		this.predmeti = predmeti;
	}
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Info Profesor " + getImePrezime();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public List<String> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(List<String> predmeti) {
		this.predmeti = predmeti;
	}
	
	
}
