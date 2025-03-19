package model;

public abstract class Room {
    protected String roomNumber;
    protected double price;
    protected boolean isBooked;

    public Room (String roomNumber , double price){
      this.roomNumber = roomNumber;
      this.price = price;
      this.isBooked = false;
    }

    public abstract String getRoomType();

    public boolean isBooked() {
      return isBooked;
  }

  public void bookRoom() {
    this.isBooked = true;
}
public void canceBooking(){
  this.isBooked =false;
}

public String getDetails(){
  return getRoomType() + " - Room " + roomNumber + " - $" + price + " - " + 
               (isBooked ? "Booked" : "Available");
}

  
  
}
