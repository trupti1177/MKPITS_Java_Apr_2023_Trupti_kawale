public class CalculatorService{
    //double response;
    public double Calculate(String operator, double operand1, double operand2){
        switch (operator){
            case "+": AdditionCalculation additionCalculation = new AdditionCalculation();
                //System.out.println("Addition of two number");
                double addition = additionCalculation.getCalculatedValue(operand1,operand2);
                return addition;
            case "-": SubstractionCalculation substractionCalculation = new SubstractionCalculation();
                //System.out.println("Addition of two number");
                double substraction = substractionCalculation.getCalculatedValue(operand1,operand2);
                return substraction;
            case "*": MultiplicationCalculation multiplicationCalculation = new MultiplicationCalculation();
                //System.out.println("Addition of two number");
                double multiplicaiton = multiplicationCalculation.getCalculatedValue(operand1,operand2);
                return multiplicaiton;
            case "/" : DivisionCalculation divisionCalculation = new DivisionCalculation();
                //System.out.println("Addition of two number");
                double division = divisionCalculation.getCalculatedValue(operand1,operand2);
                return division;
            case "%" : ModuloCalculation moduloCalculation = new ModuloCalculation();
                //System.out.println("Addition of two number");
                double modulus = moduloCalculation.getCalculatedValue(operand1,operand2);
                return modulus;
        }
        return 0;
    }
}