package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(1999,1,1, "hewlett", "NY", "USA");
		StreetUSAddress addy = new StreetUSAddress("8 oak  Street", "apt 4b", "NY","NY","11561");
		String brand = "apple";
		Person steve= new Person("steve", "davids", "023-345-367",  pdob, addy);
		Computer c1 = new Computer(brand, "na",8,400, true, 200);
		Computer c2 = new Computer(brand, "na",8,1100, false, 200);
		Computer c3 = new Computer(brand, "na",8,200, true,200);
		Computer c4 = new Computer(brand, "na",8,1200, false, 200);
		Computer [] cArr = {c1,c2,c3,c4};
		ComputerOwner tt = new ComputerOwner(steve);
		tt.addComputer(c1);
		tt.addComputer(c2);
		tt.addComputer(c3);
		tt.addComputer(c4);
		tt.removeComputer(0);
		tt.removeComputer(1);
		System.out.println(tt);

		try(var output =new PrintWriter(new FileOutputStream(
					new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");
			DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(1999,1,1, "hewlett", "NY", "USA");
			StreetUSAddress addy2 = new StreetUSAddress("8 oak  Street", "apt 4b", "NY","NY","11561");
			String brand2 = "apple";
			Person steve2= new Person("steve", "davids", "023-345-367",  pdob2, addy2);
			Computer c12 = new Computer(brand2, "na",8,400, true, 200);
			Computer c22 = new Computer(brand2, "na",8,1100, false, 200);
			Computer c32 = new Computer(brand2, "na",8,200, true,200);
			Computer c42 = new Computer(brand2, "na",8,1200, false, 200);
			ComputerOwner tt2 = new ComputerOwner(steve2);
			tt2.addComputer(c12);
			tt2.addComputer(c22);
			tt2.addComputer(c32);
			tt2.addComputer(c42);
			tt2.removeComputer(2);
			tt2.removeComputer(1);
			output.println(tt2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}





	}
}
