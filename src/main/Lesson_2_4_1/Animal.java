package Lesson_2_4_1;

public class Animal {
    private static int countAnimal = 0;
    String nameAnimal;
    private static int bowlEat = 0;

    public Animal() {
        countAnimal++;
    }

    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        countAnimal++;
    }

    public void run(int distance) {
        System.out.println(nameAnimal + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(this.nameAnimal + " проплыл " + distance + " м.");
    }

    public void eat(int portion) {
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public static void setBowlEat(int bowlEat) {
        Animal.bowlEat = Animal.bowlEat + bowlEat;
    }

    public static int getBowlEat() {
        return bowlEat;
    }
}
