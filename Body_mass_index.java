package assignments;
import java.util.*;
public class Body_mass_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Weight= sc.nextDouble();
		double Height = sc.nextDouble();
		double x = (Height * Height);
		double y = (Weight/x);
		System.out.println(y);
	}

}
