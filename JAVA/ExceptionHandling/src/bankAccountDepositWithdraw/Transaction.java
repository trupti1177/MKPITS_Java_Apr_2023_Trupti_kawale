package bankAccountDepositWithdraw;

public class Transaction {
    public double depositeAmount(CustomerDetails customer_1,int amount){
        customer_1.setBalance(customer_1.getBalance()+amount);
        return customer_1.displayDetails();
    }
    public double withdrawAmount(CustomerDetails customer_2,int amount){
        customer_2.setBalance(customer_2.getBalance()-amount);
        return customer_2.getBalance();
    }
    public void transferAmount(CustomerDetails customer_1,CustomerDetails customer_2,int amount){
        customer_1.setBalance(customer_1.getBalance()-amount);
        customer_2.setBalance(customer_2.getBalance()+amount);
    }
}