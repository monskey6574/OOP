package model;

public class Booking {

  private Room room;
  private String guesName;

  public Booking (Room room , String guesname){
    this.room = room;
    this.guesName =guesname;
    room.bookRoom();;
  }

  public void cancel(){
    room.canceBooking();
  }
  public String getDetails(){
    return "Booking: " + guesName + " - " + room.getDetails();
  }
  
}
