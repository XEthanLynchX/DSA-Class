
// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
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

        //Tests all the methods and displays which is being tested
        System.out.println("\nTesting methods on yourRectangle:");

        System.out.println("Testing method getWidth(): " + yourRectangle.getWidth());

        System.out.println("Testing method getHeight(): " + yourRectangle.getHeight());

        System.out.println("Testing method getArea(): " + yourRectangle.getArea());

        System.out.println("Testing method getPerimeter(): " + yourRectangle.getPerimeter());
    
        System.out.println("\nTesting method printRectangle() ");
        yourRectangle.printRectangle("yourRectangle");

        //comprehensive list of each rectangle 
        myRectangle.rectangleDetails("myRectangle");
        yourRectangle.rectangleDetails("yourRectangle");

        input.close();
    }
}
