
// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code

import java.util.Scanner;

public class TestRectangle {
    public static void main() {
        //Scanner to get user inputs
        Scanner input = new Scanner(System.in);
        // default rectangle (uses default constructor)
        Rectangle myRectangle = new Rectangle();
        // User inputted units that are used to create custom rectangle or "yourRectangle"
        System.out.print("How many units wide should your Rectangle be: ");
        double width = input.nextDouble();
        System.out.print("How many units tall should your Rectangle be: ");
        double height = input.nextDouble();
        // User custom rectangle
        Rectangle yourRectangle = new Rectangle(width, height); 
        //Prints the comprehensive details of each rectangle
        myRectangle.printRectangle("myRectangle");
        yourRectangle.printRectangle("yourRectangle");
    }
}
