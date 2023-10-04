package userDefineException;

public class InsuficentAmountException extends Exception{
    public String getMessage(){
        return "Insufficient balance. ";
    }
}