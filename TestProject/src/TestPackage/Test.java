package TestPackage;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test");
		int i = 0;
		int j = 1;
		
		for(int x = 0; x<10; x++) {
			i++;
			j= i+j;
		}
		System.out.println(j);
	}

}
