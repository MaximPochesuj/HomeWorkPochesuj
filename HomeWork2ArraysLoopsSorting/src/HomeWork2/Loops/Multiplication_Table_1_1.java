package HomeWork2.Loops;

public class Multiplication_Table_1_1 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения:");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i * j);
            }
        }
        System.out.println("Конец");
    }
}
