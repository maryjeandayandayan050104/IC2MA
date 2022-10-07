/*
PROGRAMMED BY  : DAYANDAYAN, MARY JEAN C.
TOPIC          : LOOPING STATEMENT
*/
import java.util.Scanner;
public class java_alphabet {
	public static void main(String[] args) {
		Scanner fox = new Scanner(System.in);
		char elmt;
		do {
			System.out.println("\n[=========WELCOME TO ELEMENT IDENTIFIER=========]\n");
			System.out.print("Enter Element: ");
			elmt = fox.next().charAt(0);
			System.out.println("\n=================================================");
			if(elmt == '0' || elmt == '1' || elmt == '2' || elmt == '3' || elmt == '4' || elmt == '5' || elmt == '6' || elmt == '7' || elmt == '8' || elmt == '9') {
				System.out.println("Data entered: " + elmt +" is Numeric");
				System.out.println("Oh, I see a number...");
			}else if(elmt == 'b' || elmt == 'c' || elmt == 'd' || elmt == 'f' || elmt == 'g' || elmt == 'h' || elmt == 'j' || elmt == 'k' || elmt == 'l' || elmt == 'm' || elmt == 'n' || elmt == 'p' || elmt == 'q' || elmt == 'r' || elmt == 's' || elmt == 't' || elmt == 'v' || elmt == 'w' || elmt == 'x' || elmt == 'y' || elmt == 'z') {
				System.out.println("Data entered: "+ elmt +" is Lowercase Alphabet");
				System.out.println("Oh it's a consonant...");
			}else if(elmt == 'B' || elmt == 'C' || elmt == 'D' || elmt == 'F' || elmt == 'G' || elmt == 'H' || elmt == 'J' || elmt == 'K' || elmt == 'L' || elmt == 'M' || elmt == 'N' || elmt == 'P' || elmt == 'Q' || elmt == 'R' || elmt == 'S' || elmt == 'T' || elmt == 'V' || elmt == 'W' || elmt == 'X' || elmt == 'Y' || elmt == 'Z') {
				System.out.println("Data entered: "+ elmt +" is UPPERCASE Alphabet");
				System.out.println("Oh it's a consonant...");
			}else if(elmt == 'a' || elmt == 'e' || elmt == 'i' || elmt == 'o' || elmt == 'u') {
					System.out.println("Data entered: "+ elmt + " is Lowercase Alphabet");
				System.out.println("Oh it's a VOWEL...");
			}else if(elmt == 'A' || elmt == 'E' || elmt == 'I' || elmt == 'O' || elmt == 'U') {
				System.out.println("Data entered: "+ elmt +" is UPPERCASE Alphabet");
				System.out.println("Oh it's a VOWEL...");
			}else{
				System.out.println("Element is "+ elmt + "\nhmn... I see a Special Character");
			}
			System.out.println();
			System.out.print("Check another Element? (y/n):> ");
			elmt = fox.next().charAt(0);
		}while(elmt == 'y' || elmt == 'Y');
		if(elmt == 'n' || elmt == 'N') {
			System.out.println("Program Well done, Thank you!");
			System.out.println("\n<<=============== END OF PROGRAM! ===============>");
		}else{
			System.out.println("\n******INVALID KEYS******");			
		System.out.println("\n<<=============== END OF PROGRAM! ===============>");
		}
        fox.close();
	}
}
