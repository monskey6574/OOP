package model;

public class Suite extends Room {

  public Suite(String roomNumber){
    super(roomNumber, 200.0);
    
  }

  @Override
  public String getRoomType() {
    return "Suite";
    
  }
  
}