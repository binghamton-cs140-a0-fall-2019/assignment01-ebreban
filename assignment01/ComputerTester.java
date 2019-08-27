package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		String brand = "dell";
		Computer c1 = new Computer(brand, "na",8,400, true, 200);
		Computer c2 = new Computer(brand, "na",8,1100, false, 200);
		Computer c3 = new Computer(brand, "na",8,200, true,200);
		Computer c4 = new Computer(brand, "na",8,1200, false, 200);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

			try(var output =new PrintWriter(new FileOutputStream(
				    new File("output.txt"), true /* true means append to file */))) {
				output.println("\nTESTS FOR Computer.java:");
				String brand2 = "dell";
				Computer c12 = new Computer(brand, "na",8,400, true, 200);
				Computer c22 = new Computer(brand, "na",8,1100, false, 200);
				Computer c32 = new Computer(brand, "na",8,200, true,200);
				Computer c42 = new Computer(brand, "na",8,1200, false, 200);
				output.println(c12);
				output.println(c22);
				output.println(c32);
				output.println(c42);
			//Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}
