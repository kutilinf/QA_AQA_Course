package lesson_2_4_2;

public class Rectangle implements iCalculationMethods {
    int a;
    int b;
    String backgroundColor;
    String bordeColor;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double area() {
        return a * b;
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
