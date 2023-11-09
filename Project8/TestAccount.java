package Project8;

import Project8.Account.CheckingAccount;
import Project8.Account.SavingsAccount;

public class TestAccount {

    public static void main(String[] args) {
        Account test1 = new Account(1, 400, 0.2);
        SavingsAccount test2 = test1.new SavingsAccount(2, 400, 5);
        CheckingAccount test3 = test1.new CheckingAccount(3, 1000, 0.1);

        test1.withdraw(100);
        test2.withdraw(600);
        test3.withdraw(1200);
        test3.withdraw(300);

        test1.setId(10);
        test2.setId(4);

        System.out.println(test1.toString());
        System.out.println("\n" + test2.toString());
        System.out.println("\n" + test3.toString());

    }
}
