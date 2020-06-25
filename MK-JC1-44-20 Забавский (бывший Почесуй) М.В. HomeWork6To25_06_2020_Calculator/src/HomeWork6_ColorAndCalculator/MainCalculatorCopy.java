package HomeWork6_ColorAndCalculator;

public class MainCalculatorCopy {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcCopy = new CalculatorWithMathCopy();
        double div = calcCopy.div(28, 5);
        double pow = calcCopy.power(div, 2);
        double mult = calcCopy.mult(15, 7);
        double n = 4.1;
        float sum = (float) (n + mult + pow);
        System.out.println(sum);
        float try1 = sum / 0; // исключение будет происходить только если типы переменных - int.
        // Деление на 0.0 дает бесконечность о чём и написано в результате (Infinity)
        float try2 = (float) (sum / 0.0d); // исключение будет происходить только если типы переменных - int.
        // Деление на 0.0d дает бесконечность о чём и написано в результате (Infinity)
    }
}