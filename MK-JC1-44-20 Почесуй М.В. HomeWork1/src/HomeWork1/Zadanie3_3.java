package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Zadanie3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        switch (name){
            case "Вася":
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            break;
            case "Анастасия":
            System.out.println("Я тебя так долго ждал");
            break;
            default:
            System.out.println("Добрый день, а вы кто?");
            break;
    }
    }
}

