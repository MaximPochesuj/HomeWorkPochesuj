package HomeWork1;

public class Operators_Priority {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        int e = 20;
        int f = 68;
        int g = 22;
        int h = 119;
        int j = 6;
        int m = 3;
        int o = 12;
        int s = 119;
        boolean k = true;
        boolean l = false;

        System.out.println(a + b / c); // 5 + (2/8) = 5 + 0,25 = 5 + 0 = 5
        System.out.println((a + b) / c); // 7 / 8 = 0,875 = 0
        System.out.println((a + b++) / c); // (5 + 2) / 8 = 7 / 8 = 0,875 = 0
        System.out.println((a + b++) / --c); // (5 + 3) / 7 = 8 / 7 = 1,14 = 1
        System.out.println((a * b >> b++) / --c); // (10 >> 4) / 7 = 0 / 7 = 0
        System.out.println((a + d > e ? f : g * b >> b++) / --c); //false ? 68 : 11 / 7 = 1
        System.out.println((a + d > e ? f => f : g * b >> b++) / --c); //  false ? true : 11 - несоответствие типов boolean и int;
        System.out.println(j - b > m && o * o <= s); // 4 > 3 && 144 <= 119 , true && false = false
        System.out.println(k && l); // false: true не равно false
    }
}
