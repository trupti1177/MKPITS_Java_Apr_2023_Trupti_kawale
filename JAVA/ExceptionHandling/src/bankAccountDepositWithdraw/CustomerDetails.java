package bankAccountDepositWithdraw;

public class CustomerDetails {
    private  String customerName;
    private  String accountNumber;
    private  double balance=1000;

    public CustomerDetails(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double displayDetails(){
        System.out.println("Customer Name : "+getCustomerName());
        System.out.println("Account Number : "+getAccountNumber());
        return getBalance();
    }
}