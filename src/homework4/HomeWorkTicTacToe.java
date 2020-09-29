package homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTicTacToe {

    //АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ,


    //создаем символы для игры (крестик, нолик и пустое поле)
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = ' ';

    // вводим переменные вместо fildSize.length
    private static int fieldSizeX;
    private static int fieldSizeY;

    //создаем переменнкю (двумерный массив) Игровое поле
    private static char[][] field;

    //Создаем объекты:
    // Сканер - для ввода данных
    // Рандом - для рандомных чисел
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    //Главный метод, он же точка входа в программу
    public static void main(String[] args) {
        int fieldSize = 3;
        while (true) {
            init(fieldSize);
            printField();
            playOnce(fieldSize);
            System.out.println("Играть сначала?");
            if (SCANNER.next().equals("no")) {
                break;
            }
        }
    }

    private static void playOnce(int fieldSize) {
        while (true){
            // идет метод - ход игрока
            humanTurn();
            printField();
            if (isSomebodyWins(DOT_HUMAN)) {
                System.out.println("Победил игрок!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничиья!");
                break;
            }

            aiTurn();
            printField();
            if (isSomebodyWins(DOT_AI)) {
                System.out.println("Победил Компьютер!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    private static void init (int fieldSize){
        fieldSizeX = fieldSize;
        fieldSizeY = fieldSize;


        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    //Печать игрового поля (отображение игрового поля)
    private static void printField() {
        System.out.println("==================");

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print(" | ");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " | ");
            }
            System.out.println();
        }
    }

    //Проверка на валидность вводимых координат
    private static boolean isValidCoordinate (int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    //Проверка на то, что поле не "занято" - знак в поле соответствует DOT_EMPTY
    private static boolean isNotEmptyField (int x, int y) {
        return field[y][x] != DOT_EMPTY;
    }

    // метод - ход человека, с проверкой что знак в не соответствует DOT_EMPTY
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите координаты хода X и Y (от 1 до " + fieldSizeY + ") через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCoordinate(x, y) || isNotEmptyField(x, y));
        field[y][x] = DOT_HUMAN;
    }

    //метод - ход компьютера, с проверкой что знак не соответствует DOT_EMPTY
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        }while (isNotEmptyField(x, y));
        field[y][x] = DOT_AI;
    }

    // метод проверки на Ничью
    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // метод проверки на Победу
    private static boolean isSomebodyWins(char symb) {
        if (field[0][0] == symb && field[0][1] == symb && field[0][2] == symb) return true;
        if (field[1][0] == symb && field[1][1] == symb && field[1][2] == symb) return true;
        if (field[2][0] == symb && field[2][1] == symb && field[2][2] == symb) return true;

        if (field[0][0] == symb && field[1][0] == symb && field[2][0] == symb) return true;
        if (field[0][1] == symb && field[1][1] == symb && field[2][1] == symb) return true;
        if (field[0][2] == symb && field[1][2] == symb && field[2][2] == symb) return true;

        if (field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) return true;
        if (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb) return true;
        return false;
    }
}
