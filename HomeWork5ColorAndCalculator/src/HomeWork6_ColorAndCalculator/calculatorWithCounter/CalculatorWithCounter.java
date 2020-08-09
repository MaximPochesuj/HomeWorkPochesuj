package HomeWork6_ColorAndCalculator.calculatorWithCounter;

import HomeWork6_ColorAndCalculator.calculatorWithOperator.ICalculator;

public class CalculatorWithCounter {
    private ICalculator calculator;
    private int counter;

    public int getCountOperation(){
        return counter;
    }

    public CalculatorWithCounter(ICalculator calculator){
        this.calculator = calculator;
    }

    public final double div (double a, double b){
        counter ++;
        return calculator.div(a,b);
    }

    public final double mult (double a, double b){
        counter ++;
        return calculator.mult(a,b);
    }

    public final double plus (double a, double b){
        counter ++;
        return calculator.plus(a,b);
    }

    public final double minus (double a, double b){
        counter ++;
        return calculator.minus(a,b);
    }

    //Степень
    public final double power (double a, double b){
        counter ++;
        return calculator.power(a,b);
    }

    //Модуль
    public final double modul (double a){
        counter ++;
        return calculator.modul(a);
    }

    //Корень
    public final double sqrt (double a){
        counter ++;
        return calculator.sqrt(a);
    }
}
