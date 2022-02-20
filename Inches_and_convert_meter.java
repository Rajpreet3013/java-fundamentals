package assignments;
import java.util.*;
public class Inches_and_convert_meter {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the inches");
		int inInches=Scan.nextInt();
		double inMeter = inInches/19.68;
		System.out.print(inMeter);
	}

}
