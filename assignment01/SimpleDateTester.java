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
		

	}
}
