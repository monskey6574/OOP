package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class StudentManage extends Student {

  ArrayList<Student> students = new ArrayList<>();

  public StudentManage(int id, String name, String degree) {
    super(id, name, degree);

  }

  public void addStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What's the ID of the student? ");
    int id = scanner.nextInt(); // Reading the integer for id
    scanner.nextLine();

    System.out.print("What's the name of the student? ");
    String name = scanner.nextLine();
    ; // Reading the student's name

    System.out.print("What's the degree of the student? ");
    String degree = scanner.nextLine(); // Reading the degree// Consume the newline left by nextInt()

    Student newStudent = new Student(id, name, degree);
    students.add(newStudent);

    System.out
    .println("ID: \n " +id+ ", Name: \n" + name + ", Degree: \n" + degree);

  }

  public void showStudets() {

    for (Student student : students) {
      System.out
          .println("ID: " + student.getId() + ", Name: " + student.getName() + ", Degree: " + student.getDegree());
    }

  }

}
