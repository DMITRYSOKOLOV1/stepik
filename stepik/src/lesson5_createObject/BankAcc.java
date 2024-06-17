package lesson5_createObject;

public class BankAcc {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double popolnenie){
        balance += popolnenie;
    }
    void snyatieSoScheta(double snyatie){
        balance -= snyatie;
    }
}

class BankAccTest{
    public static void main(String[] args) {
        BankAcc bankAcc = new BankAcc();
        bankAcc.balance = 33.33;
        bankAcc.popolnenieScheta(6);
        System.out.println(bankAcc.balance);
        bankAcc.snyatieSoScheta(39.33);
        System.out.println(bankAcc.balance);
    }
}
