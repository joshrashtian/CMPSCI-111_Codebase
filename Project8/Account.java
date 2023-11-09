package Project8;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double interestrate = 0;

    Account () {

    }
    
    Account (int newid, double newbal, double newinterest) {
        id = newid;
        balance = newbal;
        interestrate = newinterest;
    }

    int getId () {
        return id;
    }

    double getBal () {
        return balance;
    }

    double getIntRate() {
        return interestrate;
    }

    void setId (int newId) {
        id = newId;
    }

    void setBalance(double newbalance){
        balance = newbalance;
    }

    void setIntRate(double newinterest) {
        interestrate = newinterest;
    }

    double withdraw(double amount){
        balance = balance - amount;
        return amount;
    }

    void deposit(double amount){
        balance = balance + amount;
    }

    public String toString(){
        String message = "Account ID: " + id + "\nAccount Balance: " + balance + "\nInterest Rate: " + interestrate;
        return message;
    }

    class SavingsAccount extends Account {
        private int id = 0;
        private double balance = 0;
        private double interestrate = 0;
        SavingsAccount () {
    
        }
        
        SavingsAccount (int newid, double newbal, double newinterest) {
            id = newid;
            balance = newbal;
            interestrate = newinterest;
        }

    int getId () {
    return id;
    }

    double getBal () {
        return balance;
    }

    double getIntRate() {
        return interestrate;
    }

    void setId (int newId) {
        id = newId;
    }

    void setBalance(double newbalance){
        balance = newbalance;
    }

    void setIntRate(double newinterest) {
        interestrate = newinterest;
    }
        
        double withdraw(double amount){
            double futureAmount = balance - amount;
            if(futureAmount > 0) {
            balance = balance - amount;
            } 
            return amount;
        }
    
        void deposit(double amount){
            balance = balance + amount;
        }
    
        public String toString(){
            String message = "Account ID: " + id + "\nAccount Balance: " + balance + "\nInterest Rate: " + interestrate;
            return message;
        }
    }

    class CheckingAccount extends Account{
        private int id = 0;
        private double balance = 0;
        private double interestrate = 0;
        CheckingAccount () {
    
        }
        
        int getId () {
        return id;
    }

    double getBal () {
        return balance;
    }

    double getIntRate() {
        return interestrate;
    }

    void setId (int newId) {
        id = newId;
    }

    void setBalance(double newbalance){
        balance = newbalance;
    }

    void setIntRate(double newinterest) {
        interestrate = newinterest;
    }

        CheckingAccount (int newid, double newbal, double newinterest) {
            id = newid;
            balance = newbal;
            interestrate = newinterest;
        }
    
        double withdraw(double amount){
            double futureAmount = balance - amount;
            if(futureAmount > -500) {
            balance = balance - amount;
            } 
            return amount;
        }
    
        void deposit(double amount){
            balance = balance + amount;
        }
    
        public String toString(){
            String message = "Account ID: " + id + "\nAccount Balance: " + balance + "\nInterest Rate: " + interestrate;
            return message;
        }
    }
    
}
