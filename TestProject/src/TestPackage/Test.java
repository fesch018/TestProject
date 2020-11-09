package TestPackage;

public class Test {

	public static void main(String[] args) {
		Monster boogeyman = new Monster("Boogeyman", 3);
		Person p1 = new Person("Hans", "Franz");
		Person p2 = new Person("Magdalena", "Dicktitte");
		
		boogeyman.einfügen(p1);
		boogeyman.einfügen(p2);
		
		System.out.println(boogeyman);
		
	}
	
		
}
