// 1. write a program that gets two numbers from the program and display the product of those two numbers 
	/* - Determine the specification
		* input: num1, num2
		* process: result = num1*num2
		* output: result
	/* - design
	 * 1. introduce the program 
	 * 2. ask the user for the int inputs
	 * 3. wait for user inputs and store in variables 
	 * 4. calculate
	 * 5. display the result 
	/* - implementation
	 */
import java.util.Scanner;
public class MultTwo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.println("Welcome");
	System.out.println("Enter two int values");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int result = num1 * num2;
	System.out.println("result is" + result);
}
}
	
	