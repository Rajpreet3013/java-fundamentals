package assignments;
import java.util.*;
public class Tempreatur_from_fahrenheit {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double Fehrenheit = Sc.nextDouble();
		
		double y = ((5 * (Fehrenheit -32))/9);
		
		System.out.println(y);
			

	}

}
