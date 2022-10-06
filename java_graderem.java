import java.util.Scanner;
public class java_graderem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int grade;
		System.out.println("===Checking your grade Remark===");
		System.out.print("Enter Grade Here: ");
		grade = s.nextInt();
		if(grade >= 101){
			System.out.println("Genius?!");
		}else if(grade >= 91){
			System.out.println("Passed, Oustanding");
		}else if(grade >= 81){
			System.out.println("Passed, Very Satisfactory");
		}else if(grade >= 75){
			System.out.println("Passed, Satisfactory");
		}else if(grade >= 60){
			System.out.println("Try Again, you Fail");
		}else{
			System.out.println("Invalid Grade, should be greater than equal 60!");
		}		
        s.close();
	}
}