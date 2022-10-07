/*
PROGRAMMED BY  : DAYANDAYAN, MARY JEAN C.
SECTION        : 12 - IC2MA
TOPIC          : LOOPING STATEMENT
WEEK NO        : WEEK 6 
*/
import java.util.Scanner;
public class java_loopgs {
	public static void main(String[] args) {
		Scanner fur = new Scanner(System.in);
		float a, b, c, d, e;
		String name;
		char furr;
		do {
		System.out.println("\n[=====STUDENT SIMPLE GRADING SYSTEM=====]\n");
		System.out.print("\nStudent Name: ");
		name = fur.nextLine();	
		System.out.print("\nEnter 1st Quarter Grade: ");
		a = fur.nextFloat();
		System.out.print("Enter 2nd Quarter Grade: ");
		b = fur.nextFloat();
		System.out.print("Enter 3rd Quarter Grade: ");
		c = fur.nextFloat();
		System.out.print("Enter 4th Quarter Grade: ");
		d = fur.nextFloat();
		System.out.println("=================================================");
		System.out.println("Hello "+ name);
		e = ((a+b +c +d)/4);
		System.out.println("Average Grade is "+ e);
		if(e >= 75){
			System.out.println("Remark is: PASS");
		}else{
			System.out.println("Remark is: FAIL");
		}
		System.out.println();
			System.out.print("Enter another student? (y/n): ");
		furr = fur.next().charAt(0);
		}while(furr == 'y' || furr == 'Y');
		if(furr == 'n' || furr == 'N');
		else
			System.out.println("Invalid Input! Try Again...\n");
			System.out.println("<< -- PROGRAM WELL DONE -- >>");
			System.out.println();			
			System.out.println("!<==== END OF THE PROGRAM ====>!");
		
        fur.close();
	}
}