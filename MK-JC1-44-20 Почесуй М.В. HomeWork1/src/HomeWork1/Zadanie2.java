<<<<<<< HEAD
package HomeWork1;

public class Zadanie2 {
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

        System.out.println(a + b / c); // 5: сразу делим 2/8, получаем 0,25, потом суммируем с 5, итог 5,25 (=5)
        System.out.println((a + b) / c); // 0: сразу суммируем скобки, получаем 7, и делим на 8, получаем 0,875 (=0)
        System.out.println((a + b++) / c); // 0: сразу суммируем скобки, получаем 7, и делим на 8, получаем 0,875 (=0)
        System.out.println((a + b++) / --c); // 1:(5+2+(1)/8=1) помним про 1 из пред. примера, суммируем скобки, получаем 8, и делим на 8, получаем 1
        System.out.println((a * b >> b++) / --c); // 0:(5*(2+1) >> 2 / 7) помним про 1 из пред. примера, 3>>2=0, 5*0/7=0
        //System.out.println((a + d > e ? f : g * b >> b++) / --c); // 5: весь рез-т после a+ равен 0
        //System.out.println((a + d > e ? f => f : g * b >> b++) / --c); // 5: весь рез-т после a+ равен 0
        //System.out.println(j - b > m && o * o <= s); // 138: 6-144
        //System.out.println(k && l); // false: true не равно false
    }
}
=======
package HomeWork1;

public class Zadanie2 {
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

        System.out.println(a + b / c); // 5: сразу делим 2/8, получаем 0,25, потом суммируем с 5, итог 5,25 (=5)
        System.out.println((a + b) / c); // 0: сразу суммируем скобки, получаем 7, и делим на 8, получаем 0,875 (=0)
        System.out.println((a + b++) / c); // 0: сразу суммируем скобки, получаем 7, и делим на 8, получаем 0,875 (=0)
        System.out.println((a + b++) / --c); // 1:(5+2+(1)/8=1) помним про 1 из пред. примера, суммируем скобки, получаем 8, и делим на 8, получаем 1
        System.out.println((a * b >> b++) / --c); // 0:(5*(2+1) >> 2 / 7) помним про 1 из пред. примера, 3>>2=0, 5*0/7=0
        //System.out.println((a + d > e ? f : g * b >> b++) / --c); // 5: весь рез-т после a+ равен 0
        //System.out.println((a + d > e ? f => f : g * b >> b++) / --c); // 5: весь рез-т после a+ равен 0
        //System.out.println(j - b > m && o * o <= s); // 138: 6-144
        //System.out.println(k && l); // false: true не равно false
    }
}
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
