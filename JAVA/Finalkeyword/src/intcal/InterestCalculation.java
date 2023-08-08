package intcal;

import ln.Loan;

public final class InterestCalculation {
   private final int rateOfInterest;



    public InterestCalculation() {

        rateOfInterest = 9;
    }
      public final void calculationInterest(Loan l){
          System.out.println("Interest " +((l.getAmount()+l.getDuration())+rateOfInterest));

    }
}
