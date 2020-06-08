package TestPackage;

public class Monster {
	String name;
	int anzahlPersonen;
	public Monster(String name, int anzahlPersonen) {
		this.name = name;
		this.anzahlPersonen = anzahlPersonen;
	}
	public String getName() {
		return name;
	}
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}
	public int WasGeht() {
		return 0;
	}
}
