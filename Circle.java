import java.util.Scanner;

public class Circle {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display area
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    // Method to calculate and display circumference
    public void displayCircumference() {
        double circum = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        
        // Using double to accept decimal values
        double radius = sc.nextDouble();

        // Creating an object of Circle and passing radius
        Circle obj = new Circle(radius);
        
        // Calling methods to display area and circumference
        obj.displayArea();
        obj.displayCircumference();
        
        // Closing the scanner to avoid resource leak
        sc.close();
    }
}
