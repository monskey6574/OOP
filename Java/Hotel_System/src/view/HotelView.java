package view;

import java.util.List;

import model.Booking;
import model.Room;

public class HotelView {

  public void displayRooms(List<Room> rooms){
    System.out.println("\n Availble Rooms");
    for(Room room : rooms){
      System.out.println(room.getDetails());
    }
  }


  public void displayBookings(Booking booking){
    System.out.println("Booking succesfull");
    System.out.println(booking.getDetails());

  }


  public void cancelBooking(Booking booking){
    System.out.println("Booking canceled Succesfully");
    System.out.println(booking.getDetails());
  }





  
}
