package contoler;
import model.*;
import java.util.List;
import view.HotelView;
import java.util.ArrayList;


public class HotelController {

  private List<Room> rooms;
  private List<Booking> bookings;
  private HotelView view;

  public HotelController(HotelView view) {
    this.view = view;
    this.rooms = new ArrayList<>();
    this.bookings= new ArrayList<>();
    initializeRooms();
  }

  private void initializeRooms(){
    rooms.add(new Standerd("101"));
    rooms.add(new Delux("102"));
    rooms.add(new Suite("103") );
  }

  public void showRooms(){
    view.displayRooms(rooms);
  }

  // Additional methods to manage rooms, bookings, and interaction with the view can be added here.
}
