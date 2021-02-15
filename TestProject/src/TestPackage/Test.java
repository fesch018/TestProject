package TestPackage;

public class Test {

	public static void main(String[] args) {
		Monster boogeyman = new Monster("Boogeyman");
		Person p1 = new Person("Hans", "Franz");
		Person p2 = new Person("Magdalena", "Dicktitte");
		Person p3 = new Person("Kalle", "Kackidiot");
		
	
		boogeyman.einfügen(p1);
		boogeyman.einfügen(p2);
		boogeyman.einfügen(p3);
		
		System.out.println(boogeyman);
		
	}
	
	public static void print() {
		System.out.println("Hallo");
	}
	
		
}
