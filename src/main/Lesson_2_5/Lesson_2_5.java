package Lesson_2_5;

public class Lesson_2_5 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        checkArray(createArray(4, 4));
        catchException();
    }

    public static String[][] createArray(int rows, int columns) {
        String[][] ar = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ar[i][j] = String.valueOf(i + j);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(ar[i][j] + ", ");
            }
            System.out.println();
        }
        return ar;
    }

    public static void checkArray(String[][] ar) throws MyArraySizeException, MyArrayDataException {
        if (ar == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }
        if (ar.length != 4) {
            throw new MyArraySizeException("Неверное количество строк. Ожидается: 4, получено: " + ar.length);
        } else {
            for (int j = 0; j < ar.length; j++) {
                if (ar[j].length != 4) {
                    throw new MyArraySizeException("Неверное количество столбцов в строке " + j + ". Ожидается: 4, получено: " + ar[j].length);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                try {
                    int value = Integer.parseInt(ar[i][j]);
                    sum = sum + value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }

    public static void catchException() {
        System.out.println();
        System.out.println("Обращение к несуществующему индексу:");

        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int value = numbers[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

}

