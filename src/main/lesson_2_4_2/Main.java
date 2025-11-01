package lesson_2_4_2;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Circle circle = new Circle(5);
        circle.setBackgroundColor("Желтый");
        circle.setBordeColor("Черный");
        System.out.println("Длинна окружности: " + circle.perimeter() + ", Площадь круга: " + circle.area() + ", Цвет фона: " + circle.getBackgroundColor() + ", Цвет границы: " + circle.getBordeColor());

        System.out.println();
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setBackgroundColor("Белый");
        rectangle.setBordeColor("Синий");
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter() + ", Площадь прямоугольника: " + rectangle.area() + ", Цвет фона: " + rectangle.getBackgroundColor() + ", Цвет границы: " + rectangle.getBordeColor());

        System.out.println();
        Triangle triangle = new Triangle(5, 6, 8);
        triangle.setBackgroundColor("Красный");
        triangle.setBordeColor("Зелёный");
        System.out.println("Периметр треугольника: " + triangle.perimeter() + ", Площадь треугольника: " + triangle.area() + ", Цвет фона: " + triangle.getBackgroundColor() + ", Цвет границы: " + triangle.getBordeColor());
    }

}