// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code
import java.util.Scanner;

public class TestTemps { 
    public static void main(String[] args){ 
        // Scanner to scan user inputs
        Scanner input = new Scanner(System.in);
        // Inititation of the temps array that will be passed to DailyTemps
        int[] temps = new int[7];

        /* Get temps for each day from user inputs and assign it 
        / to the corresponding value in temps array */
        System.out.print("What will the temperature be for Monday: ");
        temps[0] = input.nextInt();

        System.out.print("What will the temperature be for Tuesday: ");
        temps[1] = input.nextInt();

        System.out.print("What will the temperature be for Wednesday: ");
        temps[2] = input.nextInt();

        System.out.print("What will the temperature be for Thursday: ");
        temps[3] = input.nextInt();
        
        System.out.print("What will the temperature be for Friday: ");
        temps[4] = input.nextInt();

        System.out.print("What will the temperature be for Saturday: ");
        temps[5] = input.nextInt();

        System.out.print("What will the temperature be for Sunday: ");
        temps[6] = input.nextInt();

        // Create an instance of DailyTemps 
        DailyTemps testTemps = new DailyTemps(temps);
        // Print initially assigned temps 
        System.out.println("\nTesting printTemps: ");
        testTemps.printTemps();
        // Print all days that are freezing from initially assigned temps 
        System.out.println("\nTesting Freezing(): ");
        int freezingDays = testTemps.Freezing();
        // Determine whether it's a day vs. days based on the amount freezing days 
        String pluralOrNot = freezingDays == 1 ? "day" : "days";
        System.out.println("\nNumber of freezing days is "+ freezingDays + " " + pluralOrNot + "\n");

        System.out.println("\nTesting Warmest(): ");
        System.out.print(testTemps.Warmest());
        
        // Used to determine whether the loop should keep asking the user to update temp
        String updateTemp = "yes"; 
        // While true it will repeatly ask the user if they want to change a temperature
        while (updateTemp.equalsIgnoreCase("yes")){
            System.out.print("\nWould You like to change a temperature for a day? (Yes/No): ");
            updateTemp = input.next();
            // Ask the user questions about day and temp they want to change
            if(updateTemp.equalsIgnoreCase("yes") ){ 
                // Ask the user for the day they are wanting to update
                System.out.print("What day would you like to update: ");
                String dayToUpdate = input.next();
                // Ask the user for the value they want to change that day to
                System.out.print("What would you like to update the temperature to: ");
                int tempToUpdate = input.nextInt();
                //Update the day the user requested to the value the user gave 
                System.out.println("\nTesting setTemp(): ");
                testTemps.setTemp(dayToUpdate, tempToUpdate);
                // Print the updated newly updated temps and days it's freezing
                System.out.print("\nUpdated Temps:");
                testTemps.printTemps();
                freezingDays = testTemps.Freezing();
                pluralOrNot = freezingDays == 1 ? "day" : "days";
                System.out.println("\nNumber of freezing days is "+ freezingDays + " " + pluralOrNot + "\n");
                System.out.print(testTemps.Warmest() + "\n");
            // breaks out the loop and exits the program
            } else if (updateTemp.equalsIgnoreCase("no")){ 
                break;
            // Tells user they inputted an invalid string and asks them again
            } else { 
                System.out.println("Invalid input, Please enter Yes or No.");
                updateTemp = "yes";
            }
        }   
        //close scanner
        input.close();   
    }
} 