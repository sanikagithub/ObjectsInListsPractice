public class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;
    


    // the class constructor
    public BankAccount(String accountHolderName, int accountNumber,double accountBalance) {
        this.balance = accountBalance;
        this.name = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(){}
    
    // Get Account Details 
    public String getAccountHolderName() {
        return this.name;
    }

    public double getAccountBalance() {
        return this.balance;
    }
    
    public int getAccountNumber() {
    return accountNumber;
    }

    //Set Account Details
    public void setAccountHolderName(String name) {
            this.name = name;
    }

    public void setAccountBalance(double accountBalance) {
            this.balance = accountBalance;
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        balance = balance - withdrawalAmount;
    }
    public void transfer(BankAccount acc, double amount) {
        withdrawal(amount);
        acc.deposit(amount);
    }
    public String toString() {
        return "The customer's name is " + name + " and their account balance is " + balance;
    }
   
}