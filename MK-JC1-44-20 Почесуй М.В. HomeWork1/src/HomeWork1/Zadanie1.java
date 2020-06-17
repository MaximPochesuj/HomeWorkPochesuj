package HomeWork1;

public class Zadanie1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -43;
        int d = -16;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(a | b); // если в любом из операндов 1, то 1
        //   42 = 101010
        // | 15 = 001111
        //   47 = 101111
        System.out.println(a & b); // если оба бита равны 1, то 1
        //   42 = 101010
        // & 15 = 001111
        //   10 = 001010
        System.out.println(a ^ b); // равен 1, если бит только в одном из операндов равен 1. Во всех других - 0
        //   42 = 101010
        // ^ 15 = 001111
        //   37 = 100101
        System.out.println(~a); // 42 = 101010, -43 = 11010101
        System.out.println(~b); // 15 = 001111, -16 = 11110000
        System.out.println(a << 2); // 42 = 101010; 168 = 10101000
        System.out.println(b << 2); // 15 = 001111; 60 = 00111100
        System.out.println(a >> 2); // 42 = 101010; => 001010 = 10
        System.out.println(b >> 2); // 15 = 001111; => 000011 = 3
        // нет необходимости System.out.println(a >>> 16);
        // нет необходимости System.out.println(b >>> 16);
        System.out.println(a >>= 2); // 42 = 101010; => 001010 = 10
        System.out.println(b >>= 2); // 15 = 001111; => 000011 = 3
        System.out.println(a |= b); // 42 = 101010; 15 = 001111; 11 = 00000101
    }

}
