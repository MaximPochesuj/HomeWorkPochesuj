package HomeWork8PersonAndAnimal;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {
    // устанавливаем набор символов для пароля: Латиница, Кирилица, Пробел
    private static String symbols = "ABCDEFGHIJKLMONPQRSTUVWXYZabcdefghijklmonpqrstuvwxyzАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя ";

    // пишем
    public static String random(int stringLength) {
        Random random = new Random();
        String value = ""; // задекларировали и инициализировали переменную
        for (int i = 0; i < stringLength; i++) {
            // значение формируется случайным образом путем суммирования символов из строки symbols
            value += symbols.charAt(random.nextInt(symbols.length()));
        }
        return value;
    }
}

