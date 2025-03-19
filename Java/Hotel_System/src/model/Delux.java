package model;

public class Delux extends Room {

  public Delux(String roomNumber){
    super(roomNumber, 100.0);
    
  }

  @Override
  public String getRoomType() {
    return "Delux";
    
  }
  
}
