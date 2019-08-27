package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDate {
	private int year;
	private int month;
	private int day;

	public SimpleDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;

	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public static SimpleDate of(int yr, int m, int d){
		var returnValue = new SimpleDate(d,m,yr);
		return returnValue;
	}
	public boolean before(SimpleDate other){
		if(other.getYear() < year){
			return false;
		}if(other.getMonth() < month){
			return false;
		}if(other.getDay() < day){
			return false;
		}else{
			return true;
		}
	}

}
