package homeworks.level1.homework1;

public class Lesson1 {
    public static void main(String[] args) {

        //Задание 2
        byte b = 123;
        short s = 12344;
        int x = 323543543;
        long l = 3243L;
        float f = 312.3F;
        double d = 3232.433;
        char c = 'c';
        boolean b1 = true;
        String s1 = "C";


        System.out.println("задание №3:");
        System.out.println(calculateExpression(1, 3,3, 2));


        System.out.println( "\nзадание №4:");
        System.out.println(checkSummRange(4, 5));


        System.out.println( "\nзадание №5:");
        positiveOrNegative(-2);

        System.out.println( "\nзадание №6:");
        System.out.println(isNumberNegative(-2));

        System.out.println( "\nзадание №7:");
        greeting("John");

        System.out.println( "\nзадание №8:");
        isLeapYear(800);

    //Задание 3
    }
    static int calculateExpression(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    //Задание 4
    static boolean checkSummRange (int a, int b){
        if (a + b >= 10 && a + b <= 20) {
           return true;
        }
        return false;
    }

    //Задание 5
    static void positiveOrNegative (int number) {
        if (number >= 0) {
            System.out.println(number + " - число положительное");
        } else {
            System.out.println(number + " - число отрицательное");
        }
    }

    //Задание 6
    static boolean isNumberNegative (int number) {
        if (number < 0) {
            return true;
        }
        return false;
    }

    //Задание 7
    static void greeting (String name) {
        System.out.println("Привет, " + name + "!");
    }

    //Задание 8*
    static void isLeapYear (int year) {
        if ((year % 400 == 0)||(year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

}
