import java.util.Scanner;

public class TicketBooking {
    String movieName;
    int seatNumber;
    int price;

    TicketBooking(String mV, int seatNo, int p){
        movieName=mV;
        seatNumber=seatNo;
        price=p;
    }
    boolean isBooked=false;
    public void bookTicket(){
       
        if(!isBooked){
            isBooked=true;
            displayTicketDetails();
        }
        else{
            System.out.println("seat "+seatNumber+" is already booked");
        }
    }

    public void displayTicketDetails(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter ticket price: ");
        int price = sc.nextInt();

        // Creating a movie ticket object
        TicketBooking obj = new TicketBooking(movieName, seatNumber, price);

        // Booking the ticket
        obj.bookTicket();

        sc.close(); 
    }
}
