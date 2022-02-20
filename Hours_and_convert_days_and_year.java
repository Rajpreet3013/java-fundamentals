package assignments;
import java.util.*;
public class Hours_and_convert_days_and_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("print the hours::");
        double Hours = sc.nextInt();
        
        double days = ( Hours / 24);
        System.out.println("the days are :: "+days);
        double years = (Hours/8760);
        System.out.print("the number of years are :: "+years);
	}

}
