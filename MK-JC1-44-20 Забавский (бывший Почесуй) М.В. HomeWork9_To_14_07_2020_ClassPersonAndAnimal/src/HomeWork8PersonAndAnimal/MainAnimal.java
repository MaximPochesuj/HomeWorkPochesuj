package HomeWork8PersonAndAnimal;

import java.util.*;

public class MainAnimal {
    public static void main(String[] args) {
        // устанавливаем время начала заполнения коллекции
        int animalsStart = (int) System.currentTimeMillis();
        // заполняем коллекцию
        List<Animal> animals = new ArrayList<>();
        Random randomAge = new Random();
        for (int i = 0; i < 100_000; i++) {
            animals.add(new Animal(randomAge.nextInt(), RandomString.random(5)));
        }
        // устанавливаем время окончания заполнения коллекции
        int animalsFinish = (int) System.currentTimeMillis();
        // вычисляем общее время заполнения коллекции
        int fullTime = animalsFinish - animalsStart;
        // выводим общее время заполнения коллекции на экран
        System.out.println("Время создания элементов " + fullTime); // 249 милисек

        // сортируем коллекцию с помощью компоратора
        animals.sort(new AnimalAgeComparator());

        // устанавливаем время начала удаления коллекции
        int animalsDeleteStart = (int) System.currentTimeMillis();
        // удаляем элементы коллекции с помощью цикла while
        while (animals.size() > 0) {
            animals.remove(0);
        }
        // устанавливаем время окончания удаления коллекции
        int animalsDeleteFinish = (int) System.currentTimeMillis();
        // устанавливаем полное время удаления коллекции
        int animalsFullTimeDelete = (int) System.currentTimeMillis();
        // выводим общее время заполнения коллекции на экран
        System.out.println("Время удаления всех элементов " + animalsFullTimeDelete); // 1288163712 милисек
    }
}
