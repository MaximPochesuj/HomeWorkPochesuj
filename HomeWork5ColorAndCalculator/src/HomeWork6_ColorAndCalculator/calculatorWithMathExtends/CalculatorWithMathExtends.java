package HomeWork6_ColorAndCalculator.calculatorWithMathExtends;

import HomeWork6_ColorAndCalculator.calculatorWithOperator.CalculatorWithOperator;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    public double power(double a, double b) {
        double result = Math.pow(a, b);
        return result;
    }

    public double sqrt(double a) {
        double result = Math.sqrt(a);
        return result;
    }

    public double modul(double a) {
        double result = Math.abs(a);
        return result;
    }
}
