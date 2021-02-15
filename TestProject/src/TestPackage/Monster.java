package TestPackage;

import java.util.LinkedList;
import java.util.List;

public class Monster {
	private String name;
	private List<Person> gefressenePersonen;
	
	public Monster(String name) {
		this.name = name;
		gefressenePersonen = new LinkedList<Person>();
	}
	public String getName() {
		return name;
	}
	public int getAnzahlPersonen() {
		return gefressenePersonen.size();
	}
	public String toString() {
		return this.name + " hat " + getAnzahlPersonen() + " Menschen gefressen"; 
	}
	public void einfügen(Person p) {
		gefressenePersonen.add(p);
	}
}
