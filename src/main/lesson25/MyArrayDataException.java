package lesson25;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int rows, int columns) {
        super("Данные в ячейке, [" + rows + "][" + columns + "]" + "невозможно преобразовать в число.");
    }

}