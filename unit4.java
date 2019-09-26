/**
 * @author abreu
 *
 */
import java.util.Scanner;
public class unit4 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int age;
		String name;
		String option="can't";
		
		System.out.println("This program will check if yoou're legal to drink alcohol");
		System.out.println("Enter your name: ");
		name = in.next();
		System.out.printf("Ok %s, Enter your age: ",name );
		age = in.nextInt();
		
			if(age >= 21) {
				option ="can";
			}
		
		System.out.printf("you %s drink alcohol",option );
	

	}

}
