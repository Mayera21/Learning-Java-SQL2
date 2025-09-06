class Bank{
    int accountNumber;
    String holderName;
    double balance;
    
    // Constructor
    Bank(int accountNumber,String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    // Method to deposit amount
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    // Method to withdraw amount
    void withdraw(double  amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal of: " + amount);
        }
    }
    // Method to display account details
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Bank account1 = new Bank(101, "John Doe", 5000);
        account1.displayBalance();
        account1.deposit(1500);
        account1.withdraw( 2000);
    }
    
}
