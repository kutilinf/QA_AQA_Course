package lesson_2_4_2;

import static java.lang.Math.sqrt;

public class Triangle implements iCalculationMethods {
    private int a;
    private int b;
    private int c;
    private String backgroundColor;
    private String bordeColor;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = 0;
        double s = 0;
        if (a + b > c) {
            if (a + c > b)
                if (b + c > a)
                    p = (double) (a + b + c) / 2;
            s = sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
        } else {
            return 0.00d;
        }
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
