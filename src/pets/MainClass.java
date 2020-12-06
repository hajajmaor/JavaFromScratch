package pets;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Animal a1=new Animal();

		// Dog d1=new Dog("Boni","Pincher","brown",6);
		// Dog d2=new Dog("Klyde", "Golden Retriver", "Hahki", 10);
		//

		Scanner scan = new Scanner(System.in);

		// System.out.print("enter a name:"); // הדפסה ללא ירידת שורה
		// String nameFromInput=scan.nextLine();
		//
		// System.out.print("enter breed:");
		// String breedFromInput=scan.nextLine();
		//
		// System.out.print("enter color:");
		// String colorFromInput=scan.nextLine();
		//
		// System.out.print("enter smell sense rate:");
		// int smellSenseInput=scan.nextInt();
		//

		// Dog d3=new Dog(nameFromInput, breedFromInput, colorFromInput,
		// smellSenseInput);
		Dog d3 = new Dog("brodi", "Golden", "brown", 10);

		System.out.println(d3);

		System.out.println("amount of animals is: " + Animal.counter);

		scan.close();
	}

}
