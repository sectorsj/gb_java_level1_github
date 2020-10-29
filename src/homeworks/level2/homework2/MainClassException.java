package homeworks.level2.homework2;

public class MainClassException {
    public static void main(String[] args) {
        String[][] numbers = {
                {"3","2","k","0"},
                {"1","3","5","7"},
                {"1","2","3","4"},
                {"9","9","9","9"},
        };

        checkSize(numbers);
        System.out.println(calc(numbers));
    }

    static int calc(String[][] numbers) {
        int summ = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                try {
                    summ += Integer.parseInt(numbers[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Value is not a digit: '%s'", numbers[i][j]), e);
                }
            }
        }
        return summ;
    }

    static void checkSize(String[][] properties){
        if (properties.length != 4) {
            throw new MyArraySizeException(String.format("Array size %s instad 4", properties.length));
        }

        for (int i = 0; i < properties.length; i++){
            if (properties[i].length != 4) {
                throw new MyArraySizeException(String.format("Array[%s] size %s instad 4", i, properties[i].length));
            }
        }
    }
}
