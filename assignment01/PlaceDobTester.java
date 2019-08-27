package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDobTester {
	public static void main(String[] args) {
    DateAndPlaceOfBirth p1 = new DateAndPlaceOfBirth(2000,1,1, "hewlett", "NY", "USA");
    DateAndPlaceOfBirth p2 = new DateAndPlaceOfBirth(2000,1,1, "hewlett", "NY", "USA");
    DateAndPlaceOfBirth p3 = new DateAndPlaceOfBirth(2001,1,1, "hewlett", "NY", "USA");
    DateAndPlaceOfBirth p4 = new DateAndPlaceOfBirth(2005,12,12, "munich", "Germany");
    DateAndPlaceOfBirth p5 = new DateAndPlaceOfBirth(2003,11,9, "paris", "france");

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);

    System.out.println(p1.hasSameBirthDayAs(p2));
    System.out.println(p1.hasSameBirthDayAs(p3));
    System.out.println(p1.hasSameBirthDayAs(p4));
    System.out.println(p1.hasSameBirthDayAs(p5));

    System.out.println(p1.hasSameBirthDateAs(p2));
    System.out.println(p1.hasSameBirthDateAs(p3));
    System.out.println(p1.hasSameBirthDateAs(p4));
    System.out.println(p1.hasSameBirthDateAs(p5));

    System.out.println(p1.youngerThan(p2));
    System.out.println(p1.youngerThan(p3));
    System.out.println(p1.youngerThan(p4));
    System.out.println(p1.youngerThan(p5));

    System.out.println(p1.olderThan(p2));
    System.out.println(p1.olderThan(p3));
    System.out.println(p1.olderThan(p4));
    System.out.println(p1.olderThan(p5));



    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
      DateAndPlaceOfBirth p12 = new DateAndPlaceOfBirth(2000,1,1, "hewlett", "NY", "USA");
      DateAndPlaceOfBirth p22 = new DateAndPlaceOfBirth(2000,1,1, "hewlett", "NY", "USA");
      DateAndPlaceOfBirth p32 = new DateAndPlaceOfBirth(2001,1,1, "hewlett", "NY", "USA");
      DateAndPlaceOfBirth p42 = new DateAndPlaceOfBirth(2005,12,12, "munich", "Germany");
      DateAndPlaceOfBirth p52 = new DateAndPlaceOfBirth(2003,11,9, "paris", "france");

      output.println(p12);
      output.println(p22);
      output.println(p32);
      output.println(p42);
      output.println(p52);

      output.println(p12.hasSameBirthDayAs(p22));
      output.println(p12.hasSameBirthDayAs(p32));
      output.println(p12.hasSameBirthDayAs(p42));
      output.println(p12.hasSameBirthDayAs(p52));

      output.println(p12.hasSameBirthDateAs(p22));
      output.println(p12.hasSameBirthDateAs(p32));
      output.println(p12.hasSameBirthDateAs(p42));
      output.println(p12.hasSameBirthDateAs(p52));

      output.println(p12.youngerThan(p22));
      output.println(p12.youngerThan(p32));
      output.println(p12.youngerThan(p42));
      output.println(p12.youngerThan(p52));

      output.println(p12.olderThan(p22));
      output.println(p12.olderThan(p32));
      output.println(p12.olderThan(p42));
      output.println(p12.olderThan(p52));

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
