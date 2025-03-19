import java.util.Scanner;

import contoler.HotelController;
import view.HotelView;

public class App {
    public static void main(String[] args) throws Exception {
        HotelView view = new HotelView();
        HotelController controller = new HotelController(view);

        Scanner scanner = new Scanner(System.in);
        int choice;



         System.out.println("\nHotel Booking System");
            System.out.println("1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Show all rooms
                    controller.showRooms();
                    break;
                case 2:
                    // Book a room
                    System.out.print("Enter Room Number: ");
                    String roomNumber = scanner.nextLine();
                    System.out.print("Enter Your Name: ");
                    String guestName = scanner.nextLine();
                    break;
                case 3:
                    // Cancel a booking
                    System.out.print("Enter Room Number to cancel: ");
                    String cancelRoomNumber = scanner.nextLine();
                    break;
                case 4:
                    // Exit the application
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

                    scanner.close(); // Close the scanner to prevent memory leaks



        
    }
}
