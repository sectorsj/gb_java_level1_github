package homeworks.level2.homework3;

import java.util.*;

public class ClassMainCollectoin {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 3, 4, 2, 2, 6, 4, 7, 15, -10, 11, 7, 9, -10};
        List<Integer> integers = convertToListForNumbers(numbers);
        Set<Integer> uniqueIntegers = new HashSet<>(integers);
        System.out.println("Цифры\n" + uniqueIntegers);
        System.out.println(countNumbersNonUnique(integers));

        String[] words = {"день", "зонт", "3", "ива", "день", "3", "ночь", "3", "апельсин", "виноград", "ночь", "яблоко", "ночь", "дождь", "осень"};
        List<String> strings = convertToListForWords(words);
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println("Слова\n" + uniqueWords);
        System.out.println(countWordsNonUnique(strings));

    }

    static List<Integer> convertToListForNumbers(int[] numbers) {
        List<Integer> integers = new ArrayList<>();

        for (int number : numbers) {
            integers.add(number);
        }
        return integers;
    }

    static List<String> convertToListForWords(String[] words) {
        List<String> strings = new ArrayList<>();

        for (String word : words) {
            strings.add(word);
        }
        return strings;
    }

    static Map<Integer, Integer> countNumbersNonUnique(List<Integer> integers) {
        Map<Integer, Integer> numberCounter = new HashMap<>();
        for (Integer integer : integers) {
            if(!numberCounter.containsKey(integer)){
                numberCounter.put(integer, 1);
            } else {
                numberCounter.put(integer, numberCounter.get(integer) + 1);
            }
        }
        return numberCounter;
    }

    static Map<String, Integer> countWordsNonUnique(List<String> strings) {
        Map<String, Integer> wordCounter = new HashMap<>();
        for (String string : strings) {
            if(!wordCounter.containsKey(string)){
                wordCounter.put(string, 1);
            } else {
                wordCounter.put(string, wordCounter.get(string) + 1);
            }
        }
        return wordCounter;
    }
}