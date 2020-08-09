package HomeWork6_ColorAndCalculator.calculatorWithOperator;

public class MainCalculatorWithOperator {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        double div = calc1.div(28, 5);
        double sqrt = calc1.power(div, 2);
        double mult = calc1.mult(15, 7);
        double n = 4.1;
        float sum = (float) (n + mult + sqrt);
        System.out.println(sum);
        // деление на 0.0 дает бесконечность о чём и написано в результате (Infinity)
        float try1 = sum / 0;
        // Деление на 0.0d дает бесконечность о чём и написано в результате (Infinity)
        float try2 = (float) (sum / 0.0d);
    }
}