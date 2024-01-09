
public class Bank_Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getCustomerName() {
        return customerName;
    }

    public Bank_Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + this.balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Current Balance: $" + this.balance);
    }

    public static void main(String[] args) {
        Bank_Account myAccount = new Bank_Account("123456789", 1000.00, "Sok san", "Soksan@example.com", "123-456-7890");
        myAccount.depositFunds(500.00);
        myAccount.withdrawFunds(200.00);
        myAccount.displayAccountDetails();
    }
}