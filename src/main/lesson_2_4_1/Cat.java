package lesson_2_4_1;

public class Cat extends Animal {
    private static int countCat = 0;
    private boolean satietyCat;
    private int appetite;

    public Cat(String nameAnimal) {
        super(nameAnimal);
        this.satietyCat = false;
        this.appetite = 0;
        countCat++;
    }

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
            satietyCat = true;
            System.out.println("Аппетит кота " + getNameAnimal() +
                    " " + appetite + ", он покушал и теперь сыт." + bowl.decreaseFood(appetite));
        } else {
            System.out.println("Аппетит кота " + getNameAnimal() + " " + appetite +
                    ", он не смог покушать и остался голодным. В миске всего " + bowl.getFoodAmount() + " еды.");
        }
    }

    public static int getCountCat() {
        return countCat;
    }

    public boolean getSatiety() {
        return satietyCat;
    }

    public int getAppetite() {
        return this.appetite;
    }

}