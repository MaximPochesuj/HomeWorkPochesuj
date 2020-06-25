package HomeWork6_ColorAndCalculator;

public class CalculatorWithMathCopy {
    public final double plus(double a, double b) {
        double result = a + b;
        return result;
    }

    public final double minus(double a, double b) {
        double result = a - b;
        return result;
    }

    public final double div(double a, double b) {
        double result = a / b;
        return result;
    }

    public final double mult(double a, double b) {
        double result = a * b;
        return result;
    }

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
