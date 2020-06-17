package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Zadanie3_2<names> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        String names [] = {"Вася", "Анастасия"};
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(name,"Вася") && !
                Objects.equals(name,"Анастасия"));
            System.out.println("Добрый день, а Вы кто?");
    }
}


