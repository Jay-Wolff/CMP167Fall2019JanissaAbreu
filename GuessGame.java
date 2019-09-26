/**
 * @author Abreu
 *
 */
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
	
	// next two lines must be stated before the main method of the program
	static Scanner in = new Scanner(System.in); // allows you to use Scanner in any place on the program 
	static Random rand = new Random();
	
public static void main(String[] args) {     //  <- main method
	//Introduce the program
	System.out.println("Welcome to the Guessing 3000");
	System.out.println("Would you like to play?");
	String answer = in.next(); // can change strings to lower case by adding in.next().lowercase; after what it is equal to
	
	while(answer.equalsIgnoreCase("yes")) {
	System.out.println("Enter a number from 1-10: ");
		int userNumber = in.nextInt();
		int pcNumber = rand.nextInt(10) + 1; // PC stands for number picked by the computers own software
		
		if( userNumber == pcNumber) {
			System.out.println("You Won!");
		} else {
			System.out.println("You Lost!");
			System.out.println("The PC chose this number:" + pcNumber);
		}
		System.out.println("Would you like to play again?");
		answer = in.next();
	}
	System.out.println("OK, come back soon!");
}

}
