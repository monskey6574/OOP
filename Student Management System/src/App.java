import java.util.Scanner;

import controller.StudentManage;

public class App {
    public static void main(String[] args) throws Exception {
       StudentManage manageInstant = new StudentManage(0, null, null);

       Scanner scanner =new Scanner(System.in);
       int choose ;


       System.out.println("=================== Hello welcome to NSBM ============\n********** How can I help you ? *********");

       System.out.println("Choose the Options   \n Number 1 : add student \n Number 2 : Show Students \n {add valid number}");


       choose = scanner.nextInt();

       if(choose==1){
        manageInstant.addStudent();
       }else if(choose == 2){
        manageInstant.showStudets();

       }else{
        System.out.println("Invaled Number");
       }




    }
}
