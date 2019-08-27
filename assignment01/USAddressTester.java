package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress a1 = new StreetUSAddress("4 maple  Street", "apt 4b", "NY","NY","11561");
		StreetUSAddress a2 = new StreetUSAddress("4 maple  Street"," ", "NY","NY","11561");

		System.out.println(a1);
		System.out.println(a2);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR USAddressTester.java:");
			StreetUSAddress a12 = new StreetUSAddress("4 maple  Street", "apt 4b", "NY","NY","11561");
			StreetUSAddress a22 = new StreetUSAddress("4 maple  Street"," ", "NY","NY","11561");

			output.println(a12);
			output.println(a22);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}
