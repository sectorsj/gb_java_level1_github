package homeworks.level1.homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int counter;
        int guess;
        int number;
        do {
            System.out.println("Добро пожаловать в игру - угадай число");
            counter = 0;
            guess = -1;
            number = random.nextInt(10);
            while (counter < 3 && guess != number) {
                System.out.print("Нужно угадать число от 0 до 9: ");
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Ваше число меньше задуманного");
                    counter++;
                } else if (guess > number) {
                    System.out.println("Ваше число больше задуманного");
                    counter++;
                }
            }
            System.out.println("Вы " + (guess == number? "победили" : "проиграли " + number));
            System.out.println("Хотите сыграть еще? Да - 1, Нет - 0");
        }
        while (scanner.nextInt() == 1);
    }
}