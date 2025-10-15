package Lesson_2_4_1;

public class Main {
    public static void main(String[] args) {
        int quantity = 10;


        Cat[] cats =new Cat[quantity];
        for (int i = 0; i < quantity; i++) {
            cats[i] = new Cat("Барсик" + i);
        }

        Animal.setBowlEat(12);

        for (int i = 0; i < quantity; i++) {
            cats[i].eat(Animal.getBowlEat());
            Cat.getsatietyCat();
            System.out.print(Cat.getsatietyCat());
            System.out.println();
        }

        System.out.println();
        Animal cat = new Cat("Пушок");
        cat.run(10);
        cat.swim(5);

        System.out.println();
        Animal dog= new Dog("Барсик");
        dog.run(200);
        dog.swim(7);

        System.out.println();
        System.out.println("Количество животных: " + Animal.getCountAnimal());
        System.out.println("Количество котов: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());


    }
}
