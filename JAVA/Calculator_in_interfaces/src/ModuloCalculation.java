public class ModuloCalculation implements CalculateValue{
    public double getCalculatedValue(double operand1, double operand2) {
        double modulus = operand1 % operand2;
        return modulus;
    }
}