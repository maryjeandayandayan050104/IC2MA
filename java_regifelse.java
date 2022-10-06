import java.util.Scanner;
public class java_regifelse {
	public static void main(String[] args) {
		Scanner cat = new Scanner(System.in);
		int age;
		String name;
		float temp;
		System.out.print("Enter Name: ");
		name = cat.nextLine();
		System.out.print("Age: ");
		age = cat.nextInt();
		System.out.print("Body Temperature: ");
		temp = cat.nextFloat();
		System.out.println("=============================================");
		if(age >=10 && age <= 65 && temp >= 36.1 && temp <= 37.2){
			System.out.println("You're allowed to Enter \n"
			           + "Age Granted! \n"
			           + "Okay Normal Temperature!");
		}else{
			System.out.println("Name is " +name
			           + "\nPlease Stay at home! \n" 
			           + "You're not Allowed to Enter..");
		}	           
        cat.close();
	}	
}