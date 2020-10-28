package homeworks.level1.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FieldOfMiraclesGame {
    public static void main(String[] args) {
        char[] sharps = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        String[] secrets = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите Ваше слово");

        String secret = secrets[new Random().nextInt(secrets.length)];
        System.out.println(secret);
        String guessWord = scanner.next().toLowerCase();
        char[] bufferedSharps = Arrays.copyOf(sharps, sharps.length);

        if (guessWord.equals(secret)) {
            bufferedSharps = guessWord.toCharArray();
        }else {
            for (int i = 0; i < secret.length() && i < guessWord.length(); i++) {
                // нужно доработать что бы guessWord искал совпадения по всему массиву
                if (guessWord.charAt(i) == secret.charAt(i)) {
                    bufferedSharps[i] = guessWord.charAt(i);
                }
            }
        }

        for (int i = 0; i < bufferedSharps.length; i++){
            System.out.print(bufferedSharps[i]);
        }
        System.out.println();
    }
}
