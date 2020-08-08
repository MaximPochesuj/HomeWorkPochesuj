<<<<<<< HEAD
package HomeWork6_ColorAndCalculator;

public class CalculatorWithOperator {
    public double plus(double a, double b) {
        double result = a + b;
        return result;
    }

    public double minus(double a, double b) {
        double result = a - b;
        return result;
    }

    public double div(double a, double b) {
        double result = a / b;
        return result;
    }

    public double mult(double a, double b) {
        double result = a * b;
        return result;
    }

    public double power(double a, double b) {
        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public double sqrt(double a) {
        int b = 32;
        double result = a / 3;
        if (a <= 0) return 0;
        for (int i = 0; i < b; i++)
            result = (result + a / result) / 2;
        return result;
    }

    public double modul(double a) {
        double result = 0;
        if (a >= 0)
            return a;
        else result = -a;
        return result;
    }
=======
package HomeWork6_ColorAndCalculator;

public class CalculatorWithOperator {
    public double plus(double a, double b) {
        double result = a + b;
        return result;
    }

    public double minus(double a, double b) {
        double result = a - b;
        return result;
    }

    public double div(double a, double b) {
        double result = a / b;
        return result;
    }

    public double mult(double a, double b) {
        double result = a * b;
        return result;
    }

    public double power(double a, double b) {
        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public double sqrt(double a) {
        int b = 32;
        double result = a / 3;
        if (a <= 0) return 0;
        for (int i = 0; i < b; i++)
            result = (result + a / result) / 2;
        return result;
    }

    public double modul(double a) {
        double result = 0;
        if (a >= 0)
            return a;
        else result = -a;
        return result;
    }
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
}