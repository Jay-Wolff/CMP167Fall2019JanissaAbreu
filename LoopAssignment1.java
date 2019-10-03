
/**
 * @author Janissa Abreu 
 *
 */
import java.util.Scanner;
public class LoopAssignment1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i = 1;
		double squares;
	System.out.println("Enter a number :");
		 double n = scnr.nextInt();
		 
		 for(i = 1; i <= n ; i++) {
			 System.out.println(i);
		 }
	
	System.out.println("Print all the squares from 1 to n");
		 squares = Math.sqrt(n);
		 System.out.println(squares);
		
	System.out.println("Print the sum of two number :");
		System.out.println(n+=2);
		
	System.out.println("Print the sum of all numbers from 1 to n");

		System.out.println(i + n);

	}
}
