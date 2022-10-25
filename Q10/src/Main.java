import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        account acc1 = new account(1234,50000);
        account.setAnnualInterestRate(4.5/100);
        acc1.withdraw(5000);
        acc1.deposit(10000);
        acc1.getDataCreated();
        System.out.println("balance = "+acc1.getBalance()+"\nmonthly interset = "+acc1.getMonthlyInterestRate()+"\n date:"+acc1.getDataCreated());
    }
}