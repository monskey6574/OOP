package model;

public class Student {
  
  private int id ;
  private String name;
  private String degree;
  public String school;
  

  public Student(int id , String name , String degree ){
    this.id = id;
    this.name =name;
    this.degree = degree;
    school = "NSBM Green Unversity";
  }


  public int getId() {
    return id;
  }


  public String getName() {
    return name;
  }


  public String getDegree() {
    return degree;
  }


  public String getSchool() {
    return school;
  }

  
  
}
