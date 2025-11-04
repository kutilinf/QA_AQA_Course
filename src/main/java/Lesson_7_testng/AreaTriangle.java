package Lesson_7_testng;

import static java.lang.Math.sqrt;

public class AreaTriangle {
    public AreaTriangle() {
    }

    public double getAreaTriangle(int a, int b, int c) {
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
}