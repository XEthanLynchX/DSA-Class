// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code
import java.util.Scanner;

public class TestTemps { 
    public static void main(){ 
        Scanner input = new Scanner(System.in);
        int[] temps = new int[7];

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

        DailyTemps testTemps = new DailyTemps(temps);
        
        testTemps.printTemps();
        System.out.print("\n" + testTemps.Freezing());
        
        boolean updateTemp = true; 
        while (updateTemp == true){
            System.out.print("\nWould You like to change a temperature for a day? (true/false): ");
            updateTemp = input.nextBoolean();
            if (updateTemp == true){ 
                System.out.print("What day would you like to update: ");
                String dayToUpdate = input.next();
                System.out.print("What would you like to update the temperature to: ");
                int tempToUpdate = input.nextInt();
                testTemps.setTemps(dayToUpdate, tempToUpdate);

                System.out.print("\nUpdated Temps:");
                testTemps.printTemps();
                System.out.print(testTemps.Freezing());
            }
            else{ 
                break;
            }
        }
        
        
    }
} 