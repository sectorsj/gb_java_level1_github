package homeworks.level1.homework4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        play(scanner, random);
    }

    static void play(Scanner scanner, Random random) {
        char[][] field = getField();
        drawField(field);

        do {
            doPlayerMove(scanner, field);
            if (isFinal(field, 'X')) {
                break;
            }

            doAIMove(random, field);
            if (isFinal(field, 'O')) {
                break;
            }
            drawField(field);
        } while (true);

        System.out.println("Final score");
        drawField(field);
    }

    static boolean isFinal(char[][] field, char sign) {
        if (isWin(field, sign)) {
            String name = sign == 'X' ? "Player" : "AI";
            System.out.println(String.format("%s won", name));
            return true;
        }
        if (isDraw(field)) {
            System.out.println("There is draw detected. Thanks god no one won!");
            return true;
        }
        return false;
    }

    static boolean isWin(char[][] field, char sign) {
        /**
         * Проверка на горизонталь
         */
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }

        /**
         * Проверка на вертикаль
         */
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }

        /**
         * Проверка на диагональ
         */
        // вариант 1
        for (int i = 0; i < field.length; i++) {
            if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
                return true;
            }
        }
        return false;
    }

        // вариант 2
   //     for (int i = 0; i < field.length; i++) {
   //         if (field[i][field[i].length - i - 1] == sign){
   //             return true;
   //         }
   //     }
   //     return false;
   // }

    static boolean isDraw(char[][] field) {
        int count = field.length * field.length;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-') {
                    count--;
                }
            }
        }
        return count == 0;
    }

    static void doAIMove(Random random, char[][] field) {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (field[x][y] != '-');
        field[x][y] = 'O';
    }

//    static void doPMove(Scanner scanner, char[][] field) {
//        doPlayerMove(scanner, field);
//        if (isDraw(field)) {
//            System.out.println("There is draw detected. Thanks god no one won!");
//            break;
//        }
//    }

    static void doPlayerMove(Scanner scanner, char[][] field) {
        int x, y;
        do {
            x = getCoordinate(scanner, 'X');
            y = getCoordinate(scanner, 'Y');
        } while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static int getCoordinate(Scanner scanner, char coordName) {
        int coord;
        do {
            System.out.print(String.format("Please input %s-coordinate in range [1, 3] : ", coordName));
            /**
             * Получение значения от пользователя в даипазоне [1, 3] и
             * последующая конвертация в индексы массива
             */
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord > 2);
        return coord;
    }

    static char[][] getField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}

