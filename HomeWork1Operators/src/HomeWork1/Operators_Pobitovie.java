package HomeWork1;

public class Operators_Pobitovie {
    public static void main(String[] args) {
        int a = 42; // 42 = 0010 1010
        int b = 15; // 15 = 0000 1111
        int c = -42; // -42 = 1101 1110
        int d = -15; // -15 = 1111 0001
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));

        // Побитовое OR (|)
        System.out.println(a | b);  // результат : 47 = 0010 1111;
        System.out.println(c | d); // результат : -9 = 1111 0111;

        // Побитовое AND (&)
        System.out.println(a & b); // результат : 10 = 0000 1010;
        System.out.println(c & d); // результат : -48 = 1101 0000;

        // Побитовое XOR (^)
        System.out.println(a ^ b); // результат : 37 = 0010 0101;
        System.out.println(c ^ d); // результат : 39 = 0010 0111;

        //Побитовое NOT (~)
        System.out.println(~a); // результат -43 = 11010101;
        System.out.println(~b); // результат -16 = 11110000;
        System.out.println(~c); // результат 41 = 0010 1001;
        System.out.println(~d); // результат 14 = 0000 1110;

        // Сдвиг влево <<
        System.out.println(a << 2); //  результат 168 = 1010 1000;
        System.out.println(b << 2); //  результат 60 = 0011 1100;
        System.out.println(c << 2); // результат -168 = 0101 1000;
        System.out.println(d << 2); // результат -60 = 1100 0100;

        // Сдвиг вправо >>
        System.out.println(a >> 2); // результат 10 = 0000 1010;
        System.out.println(b >> 2); // результат 3 = 0000 0011;
        System.out.println(c >> 2); // результат -11 = 1111 0101;
        System.out.println(d >> 2); // результат -4 = 1111 1100;

        // Сдвиг вправо без учёта знака >>>
        System.out.println(a >>> 3); // результат 5 = 0000 0101;
        System.out.println(b >>> 3); // результат 1 = 0000 0001;
        System.out.println(c >>> 3); // результат 536870906 = 0001 1111 1111 1111 1111 1111 1111 1010;
        System.out.println(d >>> 3); // результат 536870910 = 0001 1111 1111 1111 1111 1111 1111 1110;

        // Сдвиг вправо с присваиванием >>=
        System.out.println(a >>= 2); // результат 10 = 0000 1010;;
        System.out.println(b >>= 2); // результат 3 = 0000 0011;
        System.out.println(c >>= 2); // результат -11 = ; 1111 1011
        System.out.println(d >>= 2); // результат -4 = 1111 1100;


        // Побитовый OR с присваиванием |=
        System.out.println(a |= b); // результат 11 = 0000 1011;
        System.out.println(c |= d); // результат -3 = 1111 1111 ;
    }

}
