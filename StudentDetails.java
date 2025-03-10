import java.util.Scanner;  // Importing Scanner class for user input

// Class to store and manage student details
public class StudentDetails {

    // Instance variables (attributes of a student)-available to all methods
    String name;
    int rollNumber;
    int marks;

    // Parameterized constructor to initialize student details
    StudentDetails(String n, int rollNo, int m) {  //these are local variables inside the constructor, once constructor finish execution these will cease to exist
        name = n;          // Assign name to instance variable
        rollNumber = rollNo; 
        marks = m;         
    }

    // Method to calculate the grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else if (marks >= 40) {
            return "E";
        } else {
            return "F (Fail)";
        }
    }

    // Method to display student details and calculated grade
    public void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Roll Number of Student: " + rollNumber);
        System.out.println("Marks of Student: " + marks);
        System.out.println("Grade of Student according to Marks: " + calculateGrade());
    }

    // Main method to take user input and create StudentDetails object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for input

        // Taking input from the user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks (out of 100): ");
        int marks = sc.nextInt();

        // Creating StudentDetails object with user inputs
        StudentDetails obj = new StudentDetails(name, rollNumber, marks);

        // Calling display method to show details
        obj.display();

        sc.close(); // Closing the scanner
    }
}
