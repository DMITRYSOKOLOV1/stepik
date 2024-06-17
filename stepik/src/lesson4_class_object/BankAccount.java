package lesson4_class_object;

public class BankAccount {
    int id;
    String name; // instance variable

    //String name = new String();
    double balance;

//    public static void main(String[] args) {
//        BankAccount MyAcc = new BankAccount();
//        BankAccount XAcc = new BankAccount();
//        BankAccount YAcc = new BankAccount();
//
//        MyAcc.id = 1;
//        MyAcc.name = "Dima";
//        MyAcc.balance = 21000.00;
//
//        XAcc.id = 2;
//        XAcc.name = "Mike";
//        XAcc.balance = 45000.00;
//
//        YAcc.id = 2;
//        YAcc.name = "Ibax";
//        YAcc.balance = 15000.00;
//
//        System.out.println(XAcc.balance);
//    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAcc = new BankAccount();
        BankAccount XAcc = new BankAccount();
        BankAccount YAcc = new BankAccount();
        BankAccount LastAcc = XAcc;

        MyAcc.id = 1;
        MyAcc.name = "Dima";
        MyAcc.balance = 21000.00;

        XAcc.id = 2;
        XAcc.name = "Mike";
        XAcc.balance = 45000.00;

        YAcc.id = 3;
        YAcc.name = "Ibax";
        YAcc.balance = 15000.00;

        LastAcc.id = 4;

        System.out.println(LastAcc.id);
        System.out.println(LastAcc.name);
        System.out.println(LastAcc.balance);
    }
}
