package HomeWork4HanoiTowers;

import java.util.Scanner;


public class HanoiF {
    int[][] ar = new int[3][1000];
    int res;

    //cntF - запрошенное количество колец всего (остается неизменным все время)
    //cnt  - запрошенное количество колец на первом столбике (рекурсия, пока не останется ни одного)
    //from - снять со столбика № (столб-источник)
    //to   - повесить на столбик № (столб-цель)
    //temp - через столбик № (временный столб-посредник)


    void GoAuto(int cntF, int cnt, int from, int to, int temp) {
        if (cntF == cnt) {    //в первый раз (до рекурсии)
            ArrInit(cnt);
        }
        if (cnt > 0) {
            GoAuto(cntF, cnt - 1, from, temp, to);    //первая рекурсия
            ArrMove(cntF, cnt, from - 1, to - 1);     //перемещение в массиве (с номера на номер): -1 потому что массив с 0
            ArrShow(cntF);                               //показать в консоли графически
            System.out.println(from + "->" + to);        //пояснить, что куда
            System.out.println();
            GoAuto(cntF, cnt - 1, temp, to, from);    //вторая рекурсия
        }
    }

    void GoManual(int cntF, int cnt) {
        if (cntF == cnt) {    //в первый раз (до рекурсии)
            ArrInit(cnt);
            ArrShow(cntF);
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);
        int r1, r2;
        do {
            System.out.println("Введите двузначным числом, с какого и на какой стержень будете перекладывать диск (для выхода" +
                    " из игры нажмите -1):");
            if (sc.hasNextInt()) {
                res = sc.nextInt();
                if (res != 12 && res != 13 && res != 21 && res != 23 && res != 31 && res != 32 && res != -1) {
                    System.out.println("Неверное число! Должно быть одно из 12 13 21 23 31 32!");
                    res = 0;
                }
            } else {
                System.out.println("Вы ввели вообще не число!");
                sc.next();
                res = 0;
            }
        } while (res == 0);

        if (res == -1) return;

        r1 = res / 10;
        r2 = res % 10;

        if (ArrMove(cntF, res, r1 - 1, r2 - 1))
            System.out.println("Вы пытаетесь положить больший диск на меньший. Повторите попытку.");
        ArrShow(cntF);                              //показать в консоли графически
        System.out.println(r1 + "->" + r2);         //пояснить, что куда

        GoManual(cntF, cnt + 1);

    }


    void ArrInit(int cnt) {                     //присваеваем первому столбику "123456", двум другим "0000000"
        for (int i = 0; i < cnt; i++) {
            ar[0][i] = cnt - i;
            ar[1][i] = 0;
            ar[2][i] = 0;
        }
    }


    boolean ArrMove(int cntF, int res, int from, int to) {

        int val1, val2;
        int ind1 = cntF - 1;
        int ind2 = cntF - 1;

        while (ar[from][ind1] == 0 && ind1 > 0)
            ind1--;                    // снижаемся пока не встретим данные либо до нуля
        val1 = ar[from][ind1];                                             // взяли эти данные

        while (ar[to][ind2] == 0 && ind2 > 0)
            ind2--;                    // снижаемся пока не встретим данные либо до нуля
        val2 = ar[to][ind2];
        if (ar[to][ind2] > 0)
            ind2++;                                      // если встретили данные, поднялись на единицу, чтобы не затереть

        if (val1 < val2 || val2 == 0) {
            ar[from][ind1] = 0;
            ar[to][ind2] = val1;
            return (false);
        }
        return (true); //ошибка - кладомый сверху диск больше
    }


    void ArrShow(int cnt) {
        for (int i = cnt - 1; i >= 0; i--) {                                  //столбики начиная с верхнего слоя до нуля
            System.out.print((ar[0][i] == 0 ? "*" : ar[0][i]) + "      " + (ar[1][i] == 0 ? "*" : ar[1][i]) +
                    "      " + (ar[2][i] == 0 ? "*" : ar[2][i]) + "      ");
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}
