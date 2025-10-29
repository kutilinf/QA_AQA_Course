package lesson_2_4_1;

public class Cat extends Animal {
    private static int countCat = 0;
    private boolean satietyCat;
    private static int appetite = 0;

    public Cat(String nameAnimal, int appetite) {
        super(nameAnimal);
        this.satietyCat = false;
        this.appetite = appetite;
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

    public void eat(Bowl bowl, int appetite) {
        if (bowl.getFoodAmount() >= appetite) {
            bowl.decreaseFood(appetite);
            satietyCat = true;
            System.out.println(getNameAnimal() + " покушал и теперь сыт." + "его аппетит "+ appetite);
        } else {
            System.out.println(getNameAnimal() + " не смог покушать. В миске мало еды." + "его аппетит "+ appetite);
        }
    }

    public static int getCountCat() {
        return countCat;
    }

    public boolean getSatiety() {
        return satietyCat;
    }


    public int getAppetite(Cat cat) {
        return appetite;
    }
}
