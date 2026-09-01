// Name: Ethan Lynch
// Class: CS 3305/Section#3
// Term: Fall 2026
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Visual Studio Code

/* This program is used to make your own custom rectangle otherwise it will create a rectangle 
using default values. In this program you are able to see different properties of your 
rectangle such as current width, height, area, and perimeter. The constructor of a 
custom rectangle takes in the width and height. You can see a comprehensive view 
of your rectangle using the printRectangle() method.  */
public class Rectangle {
    //Width and Height fields for a rectangle
    private double width;
    private double height; 

    //Non-argument (default) constructor method that creates a default rectangle 
    public Rectangle() { 
        width = 1.0;
        height = 1.0;
    }
    //Constructor method that creates a rectangle with specified width and height values passed from the test program
    public Rectangle(double width, double height){ 
        this.width = width;
        this.height = height;
    }
    // Method to retrieve the height value of the rectangle
    public double getHeight(){ 
        return this.height;
    }
    // Method to retrieve the width value of the rectangle
    public double getWidth(){ 
        return this.width;
    }
    // Method to calculate and return the area value of the rectangle
    public double getArea(){ 
        return this.width * this.height;
    }
    // Method to calculate and return the perimeter value of the rectangle
    public double getPerimeter(){ 
          return 2 * (this.width + this.height);
    }
    // Method to print a comprehensive list of details about the rectangle
    public void printRectangle(String objectName){ 
        // Determine whether units should be plural or not 
        String widthWord = (this.width == 1.0) ? "unit" : "units";
        String heightWord = (this.height == 1.0) ? "unit" : "units";
        //Comprehensive list of rectangle details 
        System.out.println("\n" + objectName + ":");
        System.err.println("------------");
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter() );
        System.out.println("\nRectangle " + objectName + " is "+ this.width + " "+ widthWord +" wide and " + this.height + " " + heightWord + " high.");
    }


}
