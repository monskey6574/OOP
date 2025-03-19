package model;

public class Standerd extends Room{

  public Standerd (String roomNumber){
    super(roomNumber ,50.0);
  }

  @Override
  public String getRoomType() {

    return "Standerd";
  }
  
}
