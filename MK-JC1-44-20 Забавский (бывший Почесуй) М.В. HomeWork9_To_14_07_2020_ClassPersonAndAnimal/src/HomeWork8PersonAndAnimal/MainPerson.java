package HomeWork8PersonAndAnimal;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        // устанавливаем время начала заполнения коллекции
        int personStart = (int) System.currentTimeMillis();
        // заполняем коллекцию
        List<Person> persons = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            persons.add(new Person(RandomString.random(5), RandomString.random(5)));
        }
        // устанавливаем время окончания заполнения коллекции
        int personEnd = (int) System.currentTimeMillis();
        // вычисляем общее время заполнения коллекции
        int fullTimePersons = personEnd - personStart;
        // выводим общее время заполнения коллекции на экран
        System.out.println("Время создания всех элементов" + fullTimePersons); // 264 милисек

        // сортируем коллекцию с помощью компоратора
        persons.sort(new PersonPassLengthComparator());

        // устанавливаем время начала удаления коллекции
        int deletePersonStart = (int) System.currentTimeMillis();
        // удаляем элементы коллекции с помощью итератора
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            persons.remove(0); // удаляем каждый раз элемент с индексом 0
            iterator = persons.iterator();
        }
        // устанавливаем время окончания удаления коллекции
        int deletePersonFinish = (int) System.currentTimeMillis();
        // устанавливаем полное время удаления коллекции
        int fullTimeDeletePerson = deletePersonFinish - deletePersonStart;
        // выводим общее время заполнения коллекции на экран
        System.out.println("Время удаления элементов " + fullTimeDeletePerson); // 1288206108 милисек
    }
}
