package HomeWork6_ColorAndCalculator.calculatorWithMemory;

import HomeWork6_ColorAndCalculator.calculatorWithOperator.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private ICalculator calculator;
    private double memory;

    public CalculatorWithMemory(ICalculator calculator){
        this.calculator = calculator;
    }

    double getMemory(){
        return memory;
    }

    public final void setMemory(double var){
        memory = var;
    }

    public final double plus (double a, double b){
        return calculator.plus(a,b);
    }

    public final double minus (double a, double b){
        return calculator.minus(a,b);
    }

    public final double div (double a, double b){
        return calculator.div(a,b);
    }

    public final double mult (double a, double b){
        return calculator.mult(a,b);
    }


    public double power(double a, double b) {
        return calculator.power(a,b);
    }

    public final double sqrt (double a){
        return calculator.sqrt(a);
    }

    public final double modul (double a){
        return calculator.modul(a);
    }

}
