package LAB_Assignment_4.Q2;

public class SavingsAccount extends Acccount {
    // members type, interestRate
    private String type = "Savings";
    private double interestRate;

    // default constructor
    public SavingsAccount() {
        type = "NA";
        interestRate = 0.0;
    }

    // constructor
    public SavingsAccount(int accountNo, String accountHolderName, double balance, String type, double interestRate) {
        super(accountNo, accountHolderName, balance);
        this.type = type;
        this.interestRate = interestRate;
    }

    // overriding abstract methods
    @Override
    public void displayBalance() {
        System.out.println("Balance: " + super.balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > super.balance) {
            System.out.println("Insufficient Balance");
        } else {
            super.balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    @Override
    public void deposit(double amount) {
        super.balance += amount;
        System.out.println("Deposit Successful");
    }

    // methods calculateInterest(period) and displayAccountDetails
    public void calculateInterest(int period) {
        System.out.println("Interest: " + (super.balance * interestRate * period) + " per year");
    }

    public void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("Account No: " + super.accountNo);
        System.out.println("Account Holder Name: " + super.accountHolderName);
        System.out.println("Account Type: " + type);
        System.out.println("Interest Rate: " + interestRate);
        displayBalance();
    }

}
