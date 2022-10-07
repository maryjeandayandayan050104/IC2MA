import java.util.Scanner;
public class java_testavesc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int test, score;
		double weight;
		System.out.print("Input test Number: ");
		test = s.nextInt();
		System.out.print("Input Score: ");
		score = s.nextInt();
		switch(test){
		case 1: 
		weight = score * 0.10;
		System.out.println("A score of "+ score+ " on test1 gives a weighted score of "+ weight);
		break;
		case 2: 
		weight = score * 0.20;
		System.out.println("A score of "+ score+ " on test2 gives a weighted score of "+ weight);
		break;
		case 3: 
		weight = score * 0.20;
		System.out.println("A score of "+ score+ " on test3 gives a weighted score of "+ weight);
		break;
		case 4: 
		weight = score * 0.15;
		System.out.println("A score of "+ score+ " on test4 gives a weighted score of "+ weight);
		break;
		case 5: 
		weight = score * 0.15;
		System.out.println("A score of "+ score+ " on test5 gives a weighted score of "+ weight);
		break;
		case 6: 
		weight = score * 0.29;
		System.out.println("A score of "+ score+ " on test6 gives a weighted score of "+ weight);
		break;		
		default:
		System.out.println("Invalid Test Number!, Try Again..");	
		}
		s.close();
	}
}