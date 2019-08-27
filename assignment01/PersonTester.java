package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(2001,1,1, "hewlett", "NY", "USA");
		StreetUSAddress addy = new StreetUSAddress("4 maple  Street", "apt 4b", "NY","NY","11561");
		Person pete = new Person("pete", "davidson", "023-345-367",  pdob, addy);
		System.out.println(pete);

		try(var output =new PrintWriter(new FileOutputStream(
					new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");
			DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(2001,1,1, "hewlett", "NY", "USA");
			StreetUSAddress addy2 = new StreetUSAddress("4 maple  Street", "apt 4b", "NY","NY","11561");
			Person pete2 = new Person("pete", "davidson", "023-345-367",  pdob, addy);
			output.println(pete2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}
