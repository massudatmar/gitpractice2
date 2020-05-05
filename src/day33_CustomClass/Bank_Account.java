package day33_CustomClass;

public class Bank_Account {

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){

        System.out.println("Balance is: "+balance);

    }
    public double withdrawal(double amount){

        balance = (balance-amount);
        return balance;
    }
    public double deposit(double amount){
        balance = (balance+amount);
        return balance;
    }

}
