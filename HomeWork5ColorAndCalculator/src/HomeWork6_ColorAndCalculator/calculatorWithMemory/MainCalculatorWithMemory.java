package HomeWork6_ColorAndCalculator.calculatorWithMemory;

import HomeWork6_ColorAndCalculator.calculatorWithOperator.CalculatorWithOperator;

public class MainCalculatorWithMemory {
    public static void main(String[] args) {
        double a1, a2;

        CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithOperator());

        a1 = calcMemory.mult(15,7);
        calcMemory.setMemory(a1);
        calcMemory.setMemory(calcMemory.plus(4.1, calcMemory.getMemory()));
        a1 = calcMemory.getMemory();
        System.out.println(a1);
        calcMemory.setMemory(calcMemory.power(calcMemory.div(28,5), 2));
        a2 = calcMemory.getMemory();
        calcMemory.setMemory(calcMemory.plus(a1, a2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcMemory.getMemory());
    }
}
