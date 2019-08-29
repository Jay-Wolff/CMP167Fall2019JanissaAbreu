
import java.util.Scanner;

public class Welcome {

	public static void main (String[] args) {
		//Create a Welcome message and store in Variable
		String welcome = "Welcome to Java World";
		//Output the Welcome message 
		System.out.println(welcome);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name? I'm a program");
		
		String name=input.nextLine();
		
		System.out.println("Nice to meet you, "+name+"!");
		
	}
}
