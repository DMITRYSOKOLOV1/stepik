package lesson4_class_object;

public class BankAccount {
    int id;
    String name;
    double balance;
    BankAccount(){}
    BankAccount(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;




    }
    static void main() {
        BankAccount test = new BankAccount(1, "Test", 250.50);
        BankAccount test2 = new BankAccount();
        test2.id = 2;
        test2.balance = 100;
        test2.name = "Test2";
    }
}


