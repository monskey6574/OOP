package model;

public abstract class BankAcccount {

  protected double balance;


  public BankAcccount (double initialBalance){
    this.balance = initialBalance;
  }

  public abstract void deposit(double ammount);
  public abstract void withdraw(double ammount);

  public abstract  double checkBalance();


  public void pintBalance(){
    System.out.println("Current Balance " + checkBalance());
  }

  
}
