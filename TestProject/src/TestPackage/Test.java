package TestPackage;

public class Test {

	public static void main(String[] args) {
		Monster boogeyman = new Monster("Boogeyman");
		Person p1 = new Person("Hans", "Franz");
		Person p2 = new Person("Magdalena", "Dicktitte");
		Person p3 = new Person("Kalle", "Kackidiot");
		
	
		boogeyman.einf�gen(p1);
		boogeyman.einf�gen(p2);
		boogeyman.einf�gen(p3);
		
		System.out.println(boogeyman);
		
	}
	
	public static void print() {
		System.out.println("Hallo");
	}
	
		
}
