import java.util.Scanner;
public class java_scannersample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter 1st Number: ");
		num1 = s.nextInt();
		System.out.print("Enter 2nd Number: ");
		num2 = s.nextInt();
		System.out.println("Sum is "+ (num1 + num2));
		System.out.println("Difference is "+ (num1 - num2));
		System.out.println("Product is "+ (num1 * num2));
		System.out.println("Quotient is "+ (num1 / num2));
		s.close();
		}
	}