package Lesson_2_4_2;

public class Circle implements iCalculationMethods {
    int radius;
    String backgroundColor;
    String bordeColor;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14159 * this.radius;
    }

    @Override
    public double area() {
        return 3.14159 * (this.radius * this.radius);
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBordeColor(String bordeColor) {
        this.bordeColor = bordeColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBordeColor() {
        return bordeColor;
    }

}
