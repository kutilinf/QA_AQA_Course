package Lesson_2_4_1;

public class Cat extends Animal{
    private static int countCat = 0;
    private static boolean satietyCat = false;


    public Cat() {
        countCat++;
    }

    public Cat(String nameAnimal) {
        super(nameAnimal);
        countCat++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200){
            super.run(distance);
        } else {
            System.out.println("У меня коротки лепки, я не могу столько пробежать :(");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Я не могу плавать :(");
    }

    @Override
    public void eat(int portion) {
        if (portion >= 10 ){
            satietyCat = true;
            System.out.print("Кот "+ nameAnimal + " ест: ");
                while (portion > 0) {
                    System.out.print("Ням ");
                    portion--;
                };
            } else {
                System.out.print("Кот "+ nameAnimal + " говорит этого мало. Я не наемся :(");
        }
    }

    public static int getCountCat() {
        return countCat;
    }

    public static boolean getsatietyCat() {
        return satietyCat;
    }
}
