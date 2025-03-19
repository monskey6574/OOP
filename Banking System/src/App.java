import model.Saving;

public class App {
    public static void main(String[] args) throws Exception {

        Saving savingAcc = new Saving(100, 12);

        double depositAmm = 20000;

        double withdrawAmm = 1000;

        savingAcc.deposit(depositAmm);
        savingAcc.withdraw(withdrawAmm);

        savingAcc.pintBalance();










    }
}
