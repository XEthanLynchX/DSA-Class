// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code

public class DailyTemps {
    private int[] temps = new int[7];

    public DailyTemps(int[] dailyTemps){ 
        this.temps = dailyTemps;
    }

    public void setTemps(String day, int newNumber){ 
        day = day.toLowerCase();
        switch (day) {
            case "monday": 
                this.temps[0] = newNumber;
            case "tuesday": 
                this.temps[1] = newNumber;
            case "wednesday": 
                this.temps[2] = newNumber;
            case "thursday": 
                this.temps[3] = newNumber;
            case "friday": 
                this.temps[4] = newNumber;
            case "saturday": 
                this.temps[5] = newNumber;
            case "sunday": 
                this.temps[6] = newNumber;
            }
        }

    public String Freezing(){ 
        int freezingDays = 0;

        for(int i = 0; i < this.temps.length; i++ ){ 
            if (temps[i] <= 32){ 
                freezingDays++;
            }
        }
        String pluralOrNot = (freezingDays > 1 && freezingDays != 0) ? "day" : "days";
        return "Number of freezing days is "+ freezingDays + " " + pluralOrNot + "\n";
    }    

    public void printTemps(){ 
        System.out.println("\nMonday " + temps[0]);
        System.out.println("Tuesday " + temps[1]);
        System.out.println("Wednesday " + temps[2]);
        System.out.println("Thursday " + temps[3]);
        System.out.println("Friday " + temps[4]);
        System.out.println("Saturday " + temps[5]);
        System.out.println("Sunday " + temps[6]);
    }
}

