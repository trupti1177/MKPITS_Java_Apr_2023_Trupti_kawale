package userDefineException;

public class MinimumAmountException extends Exception{
    public String getMessage(){
        return   "Balance not less than Rs.500";
    }
}