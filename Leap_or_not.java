package first_week_assignment;

public class Leap_or_not {

	public static void main(String[] args) {
		 int year = 1998;
	        
	        // Implementing our algorithm.
	        if (year % 400 == 0) {
	            System.out.println(year + " is a leap year.");
	        } else if (year % 100 == 0) {
	            System.out.println(year + " is not a leap year.");
	        } else if (year % 4 == 0) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	        
	    }


	}


