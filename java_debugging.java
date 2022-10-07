import java.util.Scanner;

public class java_debugging {

			public static void main(String[] arg) {

			    Scanner s = new Scanner(System.in);

			    String fname, gender, vac; 

			    long contact;

			    int age;

			    System.out.println(" PROGRAMMED BY  : DAYANDAYAN, MARY JEAN, C.");

			    System.out.println(" SECTION        : IC2MA");

			    System.out.println(" SUBJECT        : OOP - USING JAVA PROGRAMMING ");

			    System.out.println(" TOPIC          : CONDITIONAL IF-ELSE, SWITCH-CASE STATEMENT ");

			    System.out.println();

				System.out.println("[========  WELCOME TO RESBAKUNA FORM  =======]");

				System.out.println();

				System.out.println(" ENTER YOUR DETAILS BELOW: \n");			 		  

				System.out.print(" FULL NAME: ");

				fname = s.nextLine();

				

				System.out.print(" GENDER: ");

				gender = s.nextLine();

				

				System.out.print(" AGE : ");

				age = s.nextInt();

				

				System.out.print(" CONTACT: ");

				contact = s.nextLong();

				

				System.out.println("===========================================================");

				System.out.println( " FULL NAME : "+ fname);

				System.out.println( " GENDER : "+ gender);

				System.out.println( " AGE : "+ age);

				System.out.println( " CONTACT : "+ contact);

				System.out.println("===========================================================");				 

                 System.out.println("YOUR AGE IS: " + age);

				 System.out.println();
				 if(age <= 11)
{
				 	System.out.println("REMARKS : YOU'RE NOT QUALIFIED IN COVID19 VACCINATION");				 	

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.print("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");	 
				 }else{
				 	System.out.println("REMARKS : QUALIFIED FOR COVID19 VACCINATION");		    		     		    		
			 	System.out.println("**************[CHOOSE YOUR VACCINE BELOW ]********************");

				System.out.println("    [ CODE ]       [ BRAND ]   ");

				System.out.println();

				System.out.println("      1          BioNTech, Pfizer vaccine    ");

				System.out.println("      2          Moderna  vaccine            ");

				System.out.println("      3          Sputnik V Vaccince          ");

				System.out.println("      4          Novavax Vaccine             ");

				System.out.println("      5          Oxford, AstraZeneca Vaccine ");

				System.out.println("      6          Johnson & Johnson Vaccine   ");

				System.out.println("      7          Sinovac Vaccine            ");

				System.out.println("***************************************************************");

				System.out.println();

				System.out.print(" ENTER VACCINE CODE:  ");

				vac = s.next();

		    		switch(vac){

		    		    case "1": 
		    		        System.out.println(" You Choose 1: \n");

		    		        System.out.println(" ]== BioNTech, Pfizer vaccine ==(>");

		    		        System.out.println();

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;   

		    		    case "2":

		    		        System.out.println(" You Choose 2: \n");

		    		        System.out.println(" ]==Moderna  vaccine===(>");

		    		        System.out.println();

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;

		                    case "3":

		                    System.out.println(" You Choose 3: \n");

		    		        System.out.println(" ]==Sputnik V Vaccince==(>");

		    		        System.out.println();

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;

		    		    case "4":

		    		        System.out.println(" You Choose 4: \n");

		    		        System.out.println(" ]==Novavax Vaccine==(>");

		    		        System.out.println();

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;

		    		    case "5":

		    		        System.out.println(" You Choose 5: \n");

		    		        System.out.println(" ]==Oxford, AstraZeneca Vaccine==(>");

		    		        System.out.println();      

				System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;		    		        

		    		    case "6":

		    		        System.out.println("You Choose 6: \n");

		    		        System.out.println(" ]==Johnson & Johnson Vaccine==(>");

		    		        System.out.println();

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.print(" # STAY HOME. SAVE LIVES #");

				System.out.println("\n  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;

		    		    case "7":

		    		        System.out.println(" You Choose 7: \n");

		    		        System.out.println("]==Sinovac Vaccine==(>");

		    		        System.out.println();

		    		        System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.println("\n  # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");

		        break;

		        default:

		    		        System.out.println("You've Entered Invalid Vaccine Code!");



				    System.out.println("\n REMARKS : YOU'RE NOT QUALIFIED IN COVID19 VACCINATION");	  

				System.out.println(" \n\n  ProtekTODO sa Bakunang Sigurado \n");

				System.out.print(" # STAY HOME. SAVE LIVES #");

				System.out.print("  Help stop coronavirus..");

				System.out.println("\n");

				System.out.println("                          PROGRAM WELL DONE ...");

		        System.out.println("!!<==NOTE: THIS PROGRAM IS MADE FOR STUDENTS' PRACTICAL TEST==>!!");		     

		}

    }
    s.close();
}
}