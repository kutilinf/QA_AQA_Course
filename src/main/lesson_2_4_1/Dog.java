package lesson_2_4_1;

public class Dog extends Animal {
    private static int countDog = 0;

    public Dog() {
        countDog++;
    }

    public Dog(String nameAnimal) {
        super(nameAnimal);
        countDog++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("Для меня это слишком далеко :(");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("Для меня это слишком далеко :(, я столько не проплыву.");
        }
    }

    public static int getCountDog() {
        return countDog;
    }

}
