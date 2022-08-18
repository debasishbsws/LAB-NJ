package LAB_Assignment_4.Q2;

public abstract class Acccount {
    // members accountNo, accountHolderName, balance
    public int accountNo;
    public String accountHolderName;
    public double balance;

    // default constructor
    public Acccount() {
        accountNo = 0;
        accountHolderName = "NA";
        balance = 0.0;
    }

    // constructor
    public Acccount(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // abstract methods displayBalance, withdraw, deposit
    public abstract void displayBalance();

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);
}
