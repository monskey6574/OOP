package model;


public class Saving extends BankAcccount {

    @Override
    public double checkBalance() {
        return super.balance;
        
    }

  private double intrestRate;

  public Saving(double initialBalance , double intrestRate) {
    super(initialBalance);
    this.intrestRate = intrestRate;
   
  }

  @Override
   public void deposit(double amount){
    if (amount > 0){
      super.balance += amount;
      System.out.println("Deposited \n Current balance is =" +  amount);
    }else{
      System.out.println("Ammount is less than 0 invalied ");
    }
   }


   //the withdraw method
   @Override
  public void withdraw(double amount) {
    if (amount <= this.checkBalance()) {
        super.balance -= amount;
        System.out.println("Withdrew: " + amount);
    } else {
        System.out.println("Insufficient balance");
    }
}

  
}
