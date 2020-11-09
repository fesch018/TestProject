package TestPackage;

public class Person {
	
	String vorname;
	String nachname;
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void printName() {
		System.out.printf("Nachname: %s und Vorname: %s", getNachname(), getVorname());
	}
}
