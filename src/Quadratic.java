import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		double a, b, c;
		double root1, root2, d;
		// This is getting the input from the user
		Scanner kb = new Scanner(System.in);
		System.out.println("Given quadratic equation:ax^2 + bx + c");
		System.out.print("Enter a: ");
		a = kb.nextDouble();
		System.out.print("Enter b: ");
		b = kb.nextDouble();
		System.out.print("Enter c: ");
		c = kb.nextDouble();
		// The output of all the information given
		System.out.println("Given quadratic equation:" + a + "x^2 + " + b
				+ "x + " + c);
		d = b * b - 4 * a * c;
		if (d > 0) {
			System.out.println("Roots are real and unequal");
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The root is: " + d);
			System.out.println("When Adding: " + root1);
			System.out.println("When Subtracting: " + root2);
		} else if (d == 0) {
			System.out.println("Roots are real and equal");
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("The root is: " + d);
			System.out.println("Root: " + root1);
		} else {
			System.out.println("Roots are imaginary");
			System.out.println("The root is: " + d);
		}
	}
}