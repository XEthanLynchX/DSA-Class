// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code

/* This Program takes in array of temperatures (7). Each index corresponds to a day 
of the week. The program has methods to change the existing temperature, see the total days that
are freezing, the warmest day of the week, and print all the days of the week with their temperatures.  
 */
public class DailyTemps {
    private int[] temps = new int[7];
    /*  Constructor for DailyTemps class | Accepts an array of ints 
     index 0 represents Monday’s temperature; array index 1 represents Tuesday’s 
     temperature; etc. */
    public DailyTemps(int[] dailyTemps){ 
        this.temps = dailyTemps;
    }
    // Method for the user change temps on the existing temps array
    public void setTemp(String day, int newNumber){ 
        //Set the string to lowercase for switch / case statement's 
        day = day.toLowerCase();
        // Dependent on the day passed the existing temp will change to newInputted number
        switch (day) {
            case "monday": 
                this.temps[0] = newNumber;
                break;
            case "tuesday": 
                this.temps[1] = newNumber;
                break;
            case "wednesday": 
                this.temps[2] = newNumber;
                break;
            case "thursday": 
                this.temps[3] = newNumber;
                break;
            case "friday": 
                this.temps[4] = newNumber;
                break;
            case "saturday": 
                this.temps[5] = newNumber;
                break;
            case "sunday": 
                this.temps[6] = newNumber;
                break;
            default: 
                System.out.println("Invalid day.");
            }
        }
    // Method that returns number of days where temp is < 32 
    public int  Freezing(){ 
        //Count of freezing days
        int freezingDays = 0;
        /* iterate through the temps array and increment freezing days when it 
        comes across a value < 32 */
        for(int i = 0; i < this.temps.length; i++ ){ 
            if (temps[i] < 32){ 
                freezingDays++;
            }
        }
        return freezingDays;
    }    

    /*Method to get the warmest day of the week. */
    public String Warmest(){ 
        int warmestDay = 0;

        /*  Loops through our temp array and checks which is the highest 
         (If it comes across another temp = higest it'll keep the first one found) */
        for(int i = 1; i < this.temps.length; i++){
            if (temps[i] > temps[warmestDay]){ 
                warmestDay = i;
            }   
        }
        // List of days in the same index as our temps so the temp corresponds to the correct day
        String[] days = {
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    };
        // Return the warmest day of the week 
        return "\nThe warmest day of the week is " +  days[warmestDay]; 

        
    }

    // Print the days and corresponding temps 
    public void printTemps(){ 
        System.out.printf("%-12s %d%n", "Monday", temps[0]);
    System.out.printf("%-12s %d%n", "Tuesday", temps[1]);
    System.out.printf("%-12s %d%n", "Wednesday", temps[2]);
    System.out.printf("%-12s %d%n", "Thursday", temps[3]);
    System.out.printf("%-12s %d%n", "Friday", temps[4]);
    System.out.printf("%-12s %d%n", "Saturday", temps[5]);
    System.out.printf("%-12s %d%n", "Sunday", temps[6]);
    }
}

