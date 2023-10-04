package userDefineException;

public class Bank {
    private double balance;

    public Bank(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public double deposit(int amount){

        balance=balance+amount;
        return balance;
    }
    public double withdraw(int amount) throws InsuficentAmountException,MinimumAmountException{
        if(balance<amount)
            throw new InsuficentAmountException();
        if ((balance-amount)<500)
            throw new MinimumAmountException();
        balance=balance-amount;
        return balance;
    }
}