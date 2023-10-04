import TryCatchFinally.ArrayProgram;
import userDefineException.Bank;
import userDefineException.InsuficentAmountException;
import userDefineException.MinimumAmountException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////===================Try Catch Finally==========================================
//        ArrayProgram.displayArrayData();
//        try {
//            ArrayProgram arrayProgram = null;
//            System.out.println(arrayProgram.toString());
//        }
//        catch (NullPointerException e){
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Main Program end.");
//        }
// =================User Define Exception======================================
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the balance =");
        Bank bank=new Bank(scanner.nextDouble());
        try {
            System.out.println("Enter the deposite amount = ");
            System.out.println("Total balance after deposit amount ="+bank.deposit(scanner.nextInt()));
            System.out.println("Enter withdrawal amount = ");
            System.out.println("Total balance after withdraw amount ="+bank.withdraw(scanner.nextInt()));
        }
        catch (InsuficentAmountException e){
            System.out.println(e);
        }
        catch (MinimumAmountException e){
            System.out.println(e);
        }

//        ============================Bank Account Deposit Withdraw=====================================================
    }
}