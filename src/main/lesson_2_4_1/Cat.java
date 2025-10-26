package lesson_2_4_1;

public class Cat extends Animal {
    private static final int appetite = 15;
    private static int countCat = 0;
    private boolean satietyCat;
    public Cat(String nameAnimal) {
        super(nameAnimal);
        this.satietyCat = false;
        countCat++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("У меня коротки лепки, я не могу столько пробежать :(");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Я не могу плавать :(");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= appetite) {
            bowl.decreaseFood(appetite);
            satietyCat = true;
            System.out.println(getNameAnimal() + " покушал и теперь сыт.");
        } else {
            System.out.println(getNameAnimal() + " не смог покушать. В миске мало еды.");
        }
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public boolean getSatiety() {
        return satietyCat;
    }

    public static int getAppetite() {
        return appetite;
    }
}
