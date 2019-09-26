/**
 * 
 */

/**
 * @author abreu
 *
 */
import java.util.Scanner;
import java.util.Random;
public class Power {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	Random randGen = new Random();
		
		int dollars;
		int numbers;
		int winningNumbers = 1721253;
	System.out.println("Enter amount of dollars: ");
	dollars = scnr.nextInt();
	System.out.println(dollars + " dollars");
	
		int num1, num2, num3, num4, num5, num6, num7;
	System.out.println("Your powerball numbers are: ");
		num1 = randGen.nextInt(60) + 1;
		num2 = randGen.nextInt(60) + 1;
		num3 = randGen.nextInt(60) + 1;
		num4 = randGen.nextInt(60) + 1;
		num5 = randGen.nextInt(60) + 1;
		num6 = randGen.nextInt(60) + 1;
		num7 = randGen.nextInt(60) + 1;
	System.out.println(num1 + "  " + num2 + "  " + num3 + "  " + num4 + "  " + num5 + "  " + num6 + "  " + num7);
	numbers = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		if (numbers == winningNumbers) {
			System.out.println("Congratulations you won the Powerball! :)");
		} else {
			System.out.println("Better luck next time.");
		}

	}

}
