<<<<<<< HEAD
package HomeWork4HanoiTowers;

import java.util.Scanner;

public class Hanoi {
    int[] a1 = new int[1000];

    public static void main(String[] args) {
//------------------------------------------------------- запрос параметров
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите вариант - вручную (нажмите 1) или автоматически (нажмите 2):");
        int var = 0;
        if (sc.hasNextInt()) {
            var = sc.nextInt();
            if (var < 1 || var > 2) {
                System.out.println("Неверное число! Должно быть 1 либо 2!");
                return;
            }
        } else {
            System.out.println("Вы ввели вообще не число!");
            return;
        }
        System.out.println("Введите количество колец (от 3 и больше):");
        int cnt = 0;
        if (sc.hasNextInt()) {
            cnt = sc.nextInt();
            if (cnt < 3) {
                System.out.println("Неверное число! Должно быть от 3 и больше!");
                return;
            }
            if (cnt > 1000) {
                System.out.println("Будьте благоразумны, это займет целую вечность!");
                return;
            }
        } else {
            System.out.println("Вы ввели вообще не число!");
            return;
        }
//------------------------------------------------------- запрос параметров

        HanoiF HF = new HanoiF();                         //объявили класс
        switch (var) {
            case 1:
                HF.GoManual(cnt, cnt);                      //вызвали ручное
                break;
            case 2:
                HF.GoAuto(cnt, cnt, 1, 3, 2);                //вызвали автомат
                break;
        }
    }

}
=======
package HomeWork4HanoiTowers;

import java.util.Scanner;

public class Hanoi {
    int[] a1 = new int[1000];

    public static void main(String[] args) {
//------------------------------------------------------- запрос параметров
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите вариант - вручную (нажмите 1) или автоматически (нажмите 2):");
        int var = 0;
        if (sc.hasNextInt()) {
            var = sc.nextInt();
            if (var < 1 || var > 2) {
                System.out.println("Неверное число! Должно быть 1 либо 2!");
                return;
            }
        } else {
            System.out.println("Вы ввели вообще не число!");
            return;
        }
        System.out.println("Введите количество колец (от 3 и больше):");
        int cnt = 0;
        if (sc.hasNextInt()) {
            cnt = sc.nextInt();
            if (cnt < 3) {
                System.out.println("Неверное число! Должно быть от 3 и больше!");
                return;
            }
            if (cnt > 1000) {
                System.out.println("Будьте благоразумны, это займет целую вечность!");
                return;
            }
        } else {
            System.out.println("Вы ввели вообще не число!");
            return;
        }
//------------------------------------------------------- запрос параметров

        HanoiF HF = new HanoiF();                         //объявили класс
        switch (var) {
            case 1:
                HF.GoManual(cnt, cnt);                      //вызвали ручное
                break;
            case 2:
                HF.GoAuto(cnt, cnt, 1, 3, 2);                //вызвали автомат
                break;
        }
    }

}
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
