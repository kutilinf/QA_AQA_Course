package lesson_2_5;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int rows, int columns) {
        super("Данные в ячейке, [" + rows + "][" + columns + "]" + "невозможно преобразовать в число.");
    }

}
