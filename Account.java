public class Account {
    private int id = 0;
    private double balance = 0;

    Account () {

    }
     
    Account (int newid, double newBal){
    id = newid;
    balance = newBal;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Account account = new Account(0, 2000);
        System.out.println(account.getId());
        System.out.println(account.getBalance());
    }
}
