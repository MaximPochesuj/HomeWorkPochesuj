package HomeWorkTo07_06_2020_WarAndPiece;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class EasySearch implements ISearchEngine {
    private static final String wordSeparators = " +-,.:;!?\"()";

    @Override
    public int search(String[] originalText, String needWord) {
        int wordNumber = 0;
        for (String text : originalText) {
            if (!text.isEmpty()) {
                text = text.toUpperCase();
                needWord = needWord.toUpperCase();

                int numberPosition = 0;
                do {
                    numberPosition = text.indexOf(needWord.toUpperCase(), numberPosition);
                    if (numberPosition > -1) {
                        boolean isFreeBegin = (numberPosition == 0) || ((numberPosition > 0) &&
                                (wordSeparators.indexOf(text.charAt(numberPosition - 1)) > -1));
                        boolean isFreeEnd = (numberPosition + needWord.length() == text.length()) ||
                                (wordSeparators.indexOf(text.charAt(numberPosition + needWord.length())) > -1);
                        if (isFreeBegin && isFreeEnd) {
                            wordNumber++;
                        }
                        numberPosition += needWord.length();
                    }
                } while (numberPosition > -1);
            }
        }
        return wordNumber;
    }
}