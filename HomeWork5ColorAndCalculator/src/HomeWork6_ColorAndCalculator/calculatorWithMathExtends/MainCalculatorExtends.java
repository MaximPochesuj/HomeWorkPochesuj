package HomeWork6_ColorAndCalculator.calculatorWithMathExtends;

public class MainCalculatorExtends {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcExtends = new CalculatorWithMathExtends();
        double div = calcExtends.div(28, 5);
        double pow = calcExtends.power(div, 2);
        double mult = calcExtends.mult(15, 7);
        double n = 4.1;
        float sum = (float) (n + mult + pow);
        System.out.println(sum);
        // деление на 0.0 дает бесконечность о чём и написано в результате (Infinity)
        float try1 = sum / 0;
        // деление на 0.0 дает бесконечность о чём и написано в результате (Infinity)
        float try2 = (float) (sum / 0.0d);
    }
}