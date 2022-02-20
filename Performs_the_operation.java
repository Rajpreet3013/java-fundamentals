package homework;
import java.util.Scanner;
public class Performs_the_operation {

	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("print three char:");
		char a = scan.next().charAt(0);
		
		System.out.println("enter 1st number:");
		int b = scan.nextInt();
		
		System.out.println("enter 2nd number:");
		int c = scan.nextInt();
		
		System.out.println(a);
		
		int add = a+b+c;
		int sub = a-b-c;
		int prod = a*b*c;
		double div = a/b/c;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(prod);
		System.out.println(div);
	}
		
}	
	   