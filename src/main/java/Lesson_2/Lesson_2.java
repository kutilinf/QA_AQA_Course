package Lesson_2;

import java.util.Arrays;


public class Lesson_2 {
       public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumma(5, 7);
        numberSign(6);
        System.out.print(trueFalse(1));
        printLine("java", 5);
        System.out.print(leapYear(2024));
        replaceArray();
        emptyArray();
        multiplyArray();
        twoDimensionalArray();
        initialValueArray(10, 3);
    }

    public static void printThreeWords() {
        System.out.println("1. Метод printThreeWords()");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign(){
        System.out.println("2. Метод checkSumSign()");
        int a = -4;
        int b = 3;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    public static void printColor(){
        System.out.println("3. Метод printColor()");
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    public static void compareNumbers(){
        System.out.println("4. Метод compareNumbers()");
        int a = 100;
        int b = 101;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
        System.out.println();
    }

    public static boolean checkSumma(int a, int b){
        System.out.println("5. Метод checkSumma()");
        if ((a+b)>= 10 && (a+b) <20 ) {
            return true;
        } else {
            return false;
        }

    }

    public static void numberSign(int a){
        System.out.println("6. Метод numberSign()");

        if (a >= 0) {
            System.out.println("Вы ввели положительное число");
        }
        else {
            System.out.println("Вы ввели отрицательное число");
        }
        System.out.println();
    }

    public static boolean trueFalse(int number){
        System.out.println("7. Метод trueFalse(" + number + ")");
        return number < 10;
       }

    public static void printLine(String line,  int number){
        System.out.println();
        System.out.println();
        System.out.println("8. Метод printLine(" + line +", "+ number +")");

        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
        System.out.println();
    }

    public static boolean leapYear(int year){
        System.out.println("9. Метод leapYear("+ year + ")");
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void replaceArray(){
        System.out.println();
        System.out.println();
        System.out.println("10. Метод replaceArray()");

        int[] array = {1, 1,0,0,1,0,1,1,0,0};
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }else {
                array[i] = 0;
            }
        }

        System.out.println("Массив после замены:");
        printArray(array);
    }

    public static void emptyArray(){
        System.out.println();
        System.out.println("11. Метод emptyArray()");

        int[] array = new int[100];
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        System.out.println("Массив после замены:");
        printArray(array);
    }

    public static void multiplyArray(){
        System.out.println();
        System.out.println("12. Метод multiplyArray()");

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i]*2;
            }
        }

        System.out.println("Массив после умножения:");
        printArray(array);
    }

    public static void twoDimensionalArray(){
        System.out.println();
        System.out.println("13. Метод twoDimensionalArray()");
        String s = "";
        int size = 10;
        String st ="";
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }

        System.out.println("Массив после заполнения иагоналей:");
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        System.out.println();
    }

    public static void initialValueArray(int len, int initialValue){
        System.out.println("14. Метод initialValueArray()");
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        System.out.println("Массив после заполнения:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        String s = "";

           for (int i = 0; i < array.length; i++) {
            s = s + array[i] + ", ";
            }
        System.out.println(s);
    }

}