import intcal.InterestCalculation;
import ln.Loan;
import lone.Lone;

public class Main {
    public static void main(String[] args) {
        Loan myloan=new Loan("12345",2000,2 );
        Lone lone = new Lone();
        lone.setAccountNumber("101");
        lone.setAmount(2000);
        lone.setDuration(2);

        InterestCalculation interestCalculation = new InterestCalculation();
        interestCalculation.calculationInterest(myloan);
       double d= lone.getAmount();
       String s= lone.getAccountNumber();
       int i= lone.getDuration();
        System.out.println("rate of interest is"+d+s+i);
    }
}