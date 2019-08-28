package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate s1 =new SimpleDate(28,9,2000);
		SimpleDate s2 =new SimpleDate(29,9,2000);

		System.out.println(s1.before(s2));

		try(var output =new PrintWriter(new FileOutputStream(
					new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDateTester.java:");
			SimpleDate s12 =new SimpleDate(28,9,2000);
			SimpleDate s22 =new SimpleDate(29,9,2000);

			output.println(s12.before(s22));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
