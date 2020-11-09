package TestPackage;

import java.util.LinkedList;
import java.util.List;

public class Monster {
	private String name;
	private int anzahlPersonen;
	private List<Person> gefressenePersonen;
	
	public Monster(String name, int anzahlPersonen) {
		this.name = name;
		this.anzahlPersonen = anzahlPersonen;
		gefressenePersonen = new LinkedList<Person>();
	}
	public String getName() {
		return name;
	}
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}
	public String toString() {
		return this.name + " hat " + this.anzahlPersonen + " Menschen gefressen"; 
	}
	public void einfügen(Person p) {
		gefressenePersonen.add(p);
	}
}
