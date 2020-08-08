<<<<<<< HEAD
package HomeWork6_ColorAndCalculator;

public class MainCalculatorExtends {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcExtends = new CalculatorWithMathExtends();
        double div = calcExtends.div(28, 5);
        double pow = calcExtends.power(div, 2);
        double mult = calcExtends.mult(15, 7);
        double n = 4.1;
        float sum = (float) (n + mult + pow);
        System.out.println(sum);
        float try1 = sum / 0;
        // исключение будет происходить только если типы переменных - int.
        // Деление на 0.0 дает бесконечность о чём и написано в результате (Infinity)
        float try2 = (float) (sum / 0.0d); // исключение будет происходить только если типы переменных - int.
        // Деление на 0.0d дает бесконечность о чём и написано в результате (Infinity)
    }
=======
package HomeWork6_ColorAndCalculator;

public class MainCalculatorExtends {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcExtends = new CalculatorWithMathExtends();
        double div = calcExtends.div(28, 5);
        double pow = calcExtends.power(div, 2);
        double mult = calcExtends.mult(15, 7);
        double n = 4.1;
        float sum = (float) (n + mult + pow);
        System.out.println(sum);
        float try1 = sum / 0;
        // исключение будет происходить только если типы переменных - int.
        // Деление на 0.0 дает бесконечность о чём и написано в результате (Infinity)
        float try2 = (float) (sum / 0.0d); // исключение будет происходить только если типы переменных - int.
        // Деление на 0.0d дает бесконечность о чём и написано в результате (Infinity)
    }
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
}