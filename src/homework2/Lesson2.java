package homework2;


public class Lesson2 {
    public static void main(String[] args) {

        System.out.println("задание 1:");
        int[] zeroAndOne = {1,1,0,0,1,0,1,1,0,0};
        replaceZeroWithOne(zeroAndOne);

        System.out.println("\nзадание 2:");
        int[] arrayForFill = new int[8];
        makeArrayByStep3(arrayForFill);

        System.out.println("\nзадание 3:");
        int[] arrayForMultiplyByTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyByTwo(arrayForMultiplyByTwo);

        System.out.println("\nзадание 4:");
        int[][] squareArrayForDiagonals = new int[10][10];
        fillDiagonals(squareArrayForDiagonals);

        System.out.println("\nзадание 5:");
        int[] maxAndMinArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findMaxAndMin(maxAndMinArray);

        System.out.println("\nзадание 6:");
        int[] ballancedArray = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(ballancedArray));
    }

    private static void replaceZeroWithOne (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(i + " = " + arr[i]);
        }
    }

    private static void makeArrayByStep3 (int[] arr) {
        int step = 0;

        for (int i = 0; i < arr.length; i++, step = step + 3) {

            arr[i] = step;
            System.out.println(i + " = " + arr[i]);
        }
    }

    private static void multiplyByTwo (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

            System.out.println(i + " = " + arr[i]);
        }
    }

    private static void fillDiagonals (int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                arr[i][arr[i].length - i - 1] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findMaxAndMin (int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + min);
        System.out.println("Min = " + max);
    }

    private static boolean checkBalance (int[] arr) {
        int firstSumm = 0;
        int finalSumm = 0;
        for (int value: arr) {
            firstSumm += value;
        }
        if (firstSumm % 2 == 0){
            int summToCheck = firstSumm / 2;
            for(int value : arr) {
                finalSumm += value;
                if (finalSumm == summToCheck) {
                    return true;
                }
            }
        }
        return false;
    }
}

