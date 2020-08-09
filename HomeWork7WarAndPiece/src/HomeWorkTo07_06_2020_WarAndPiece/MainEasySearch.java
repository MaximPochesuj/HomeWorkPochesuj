<<<<<<< HEAD
package HomeWorkTo07_06_2020_WarAndPiece;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainEasySearch {
    public static void main(String[] args) {
        String filePath = "C:/Users/User/IdeaProjects/HomeWorkTo07_06_2020_WarAndPiece/Война и мир.txt";
        String[] text = readAllBytesJava7(filePath).split("\n");

        EasySearch easySearch = new EasySearch();

        System.out.println("Слово \"война\": " + easySearch.search(text, "война"));
        System.out.println("Слово \"и\": " + easySearch.search(text, "и"));
        System.out.println("Слово \"мир\": " + easySearch.search(text, "мир"));
        System.out.println();

        HashSet<String> uniqWords = new HashSet<>();
        for (String massiv : text) {
            if (!massiv.isEmpty()) {
                String[] allwords = massiv.split("\\P{L}+");
                for (String uniqWord : allwords) {
                    if (!uniqWord.isEmpty()) {
                        uniqWords.add(uniqWord);
                    }
                }
            }
        }
        System.out.println("Уникальных слов: " + uniqWords.size());
        System.out.println();

        HashMap<String, Integer> usedWordsNumber = new HashMap<>();
        for (String massiv : text) {
            if (!massiv.isEmpty()) {
                String[] allwards = massiv.split("\\P{L}+");
                for (String uniqWord : allwards) {
                    if (!uniqWord.isEmpty()) {
                        if (!usedWordsNumber.containsKey(uniqWord)) {
                            usedWordsNumber.put(uniqWord, 1);
                        } else {
                            Integer nowNumber = usedWordsNumber.get(uniqWord) + 1;
                            usedWordsNumber.replace(uniqWord, nowNumber);
                        }
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(usedWordsNumber.entrySet());
        Collections.sort(sortedWords,
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> u1, Map.Entry<String, Integer> u2) {
                        return u2.getValue().compareTo(u1.getValue());
                    }
                }
        );
        System.out.println("Топ 10 слов в романе \"Война и мир\":");
        for (int i = 0; i < 10; i++) {
            Map.Entry<String, Integer> uniqWord = sortedWords.get(i);
            System.out.printf("%d. %s - %d раз\n", i + 1, uniqWord.getKey(), uniqWord.getValue());
        }
    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
=======
package HomeWorkTo07_06_2020_WarAndPiece;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainEasySearch {
    public static void main(String[] args) {
        String filePath = "C:/Users/User/IdeaProjects/HomeWorkTo07_06_2020_WarAndPiece/Война и мир.txt";
        String[] text = readAllBytesJava7(filePath).split("\n");

        EasySearch easySearch = new EasySearch();

        System.out.println("Слово \"война\": " + easySearch.search(text, "война"));
        System.out.println("Слово \"и\": " + easySearch.search(text, "и"));
        System.out.println("Слово \"мир\": " + easySearch.search(text, "мир"));
        System.out.println();

        HashSet<String> uniqWords = new HashSet<>();
        for (String massiv : text) {
            if (!massiv.isEmpty()) {
                String[] allwords = massiv.split("\\P{L}+");
                for (String uniqWord : allwords) {
                    if (!uniqWord.isEmpty()) {
                        uniqWords.add(uniqWord);
                    }
                }
            }
        }
        System.out.println("Уникальных слов: " + uniqWords.size());
        System.out.println();

        HashMap<String, Integer> usedWordsNumber = new HashMap<>();
        for (String massiv : text) {
            if (!massiv.isEmpty()) {
                String[] allwards = massiv.split("\\P{L}+");
                for (String uniqWord : allwards) {
                    if (!uniqWord.isEmpty()) {
                        if (!usedWordsNumber.containsKey(uniqWord)) {
                            usedWordsNumber.put(uniqWord, 1);
                        } else {
                            Integer nowNumber = usedWordsNumber.get(uniqWord) + 1;
                            usedWordsNumber.replace(uniqWord, nowNumber);
                        }
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(usedWordsNumber.entrySet());
        Collections.sort(sortedWords,
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> u1, Map.Entry<String, Integer> u2) {
                        return u2.getValue().compareTo(u1.getValue());
                    }
                }
        );
        System.out.println("Топ 10 слов в романе \"Война и мир\":");
        for (int i = 0; i < 10; i++) {
            Map.Entry<String, Integer> uniqWord = sortedWords.get(i);
            System.out.printf("%d. %s - %d раз\n", i + 1, uniqWord.getKey(), uniqWord.getValue());
        }
    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
>>>>>>> abe840cce869bab4642684965272763598f8cc0b
}