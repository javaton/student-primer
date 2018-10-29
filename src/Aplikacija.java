import osoba.Osoba;
import profesor.Profesor;
import student.Student;

public class Aplikacija {

	public static void main(String[] args) {
		// Instanciranje studenta uz pomoc defaul construktora
		Student tanja = new Student();
//		System.out.println("Ime: " + tanja.imePrezime); - nije preporucljivo ovako pristupati atributima iz klase
//Dodavanje vrednosti preko setera u instanciran prazan objekat!
//		System.out.println("Student: " + tanja.getImePrezime() + ", " + tanja.getBrojIndexa());
		tanja.setImePrezime("Tanja");
		tanja.setBrojIndexa("1/2018");
		tanja.setJmbg("515140");
		System.out.println("Student: " + tanja.getImePrezime() + ", " + tanja.getBrojIndexa());

		System.out.println("JMBG: " + tanja.getJmbg());
		//Instanciranje Osobe kao studenta, kastovanje osobe u student
//		Osoba o = new Student("Djordje");
//		o.setJmbg("5454545");
//		System.out.println(o.info());
//		Student s = (Student) o;
//		System.out.println(s.getImePrezime());
		
		Osoba osoba = new Osoba("659656");
		System.out.println(osoba.info());
		Osoba student = new Student("Djodje");
		System.out.println(student.info());
		Osoba profesor = new Profesor("Tanja");
		System.out.println(profesor.info());
		
//// Instanciranje objekta pomocu konstruktora sa prosledjenim vrednostima
//		Student aleksandar = new Student("Aleksandar", "2/2018");
//		System.out.println("Student: " + aleksandar.getImePrezime() + ", " + aleksandar.getBrojIndexa());
////Instanciranje samo sa delimicnim atributima
//		Student milan = new Student("Milan");
//		System.out.println("Student: " + milan.getImePrezime() + ", " + milan.getBrojIndexa());
//		milan.setBrojIndexa("3/2018");
//		System.out.println("Student: " + milan.getImePrezime() + ", " + milan.getBrojIndexa());

	}

}
