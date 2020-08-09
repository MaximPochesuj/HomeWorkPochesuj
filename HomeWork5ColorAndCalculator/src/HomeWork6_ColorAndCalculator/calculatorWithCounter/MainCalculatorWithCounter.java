package HomeWork6_ColorAndCalculator.calculatorWithCounter;

import HomeWork6_ColorAndCalculator.calculatorWithMathCopy.CalculatorWithMathCopy;
import HomeWork6_ColorAndCalculator.calculatorWithMathExtends.CalculatorWithMathExtends;
import HomeWork6_ColorAndCalculator.calculatorWithOperator.CalculatorWithOperator;

public class MainCalculatorWithCounter {
    public static void main(String[] args) {
        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithOperator());
        calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithMathCopy());
        calculatorWithCounter = new CalculatorWithCounter(new CalculatorWithMathExtends());

        double a = calculatorWithCounter.mult(15,7);
        double b = calculatorWithCounter.plus(4.1, a);
        double c = calculatorWithCounter.div(28,5);
        double d = calculatorWithCounter.power(c,2);
        double result = calculatorWithCounter.plus(b, d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество операций = " + calculatorWithCounter.getCountOperation());

        System.out.println(calculatorWithCounter.div(result, 0));
        System.out.println(calculatorWithCounter.div(result, 0.0d));
    }
}
