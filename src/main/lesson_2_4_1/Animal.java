package lesson_2_4_1;

public abstract class Animal {
    private String nameAnimal;
    private static int countAnimal = 0;
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

    public String getNameAnimal() {
        return nameAnimal;
    }

    public abstract void eat(Bowl bowl);

    public abstract boolean getSatiety();
}
