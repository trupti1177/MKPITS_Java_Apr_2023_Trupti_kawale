public class Main {
    public static void main(String[] args) {
        CalculatedService  calculatedService = new CalculatedService ();

        calculatedService.performOperation("-",200.2,100.2);
        calculatedService.performOperation("*",130.2,20.2);
        calculatedService.performOperation("/",150.2,3.11);
        calculatedService.performOperation("+",48.3254,1254.2524);


    }
}