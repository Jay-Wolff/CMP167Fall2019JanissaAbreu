
/**
 * @author Abreu
 *
 */
public class Animal {
	//+numLegsc
	public int numLegs = 0;
	private int age = 0;
	public void bark() {
		System.out.println("Woof!");
	}
	public void run() {
		System.out.println("Run! Forest! Run!");
	}	
	public static void main(String[] args) {
		Animal A1 = new Animal();
		A1.bark();
		A1.run();
		int a = A1.numLegs;
		int b = A1.age;

	}

}
