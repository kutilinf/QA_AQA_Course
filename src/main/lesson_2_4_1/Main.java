package lesson_2_4_1;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Animal cat = new Cat("Пушок");
        cat.run(10);
        cat.swim(5);

        System.out.println();
        Animal dog = new Dog("Барсик");
        dog.run(200);
        dog.swim(7);

        System.out.println();
        System.out.println("Количество животных: " + Animal.getCountAnimal());
        System.out.println("Количество котов: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());

        System.out.println();
        Bowl bowl = new Bowl(10);
        cat.eat(bowl);
        System.out.println(cat.getNameAnimal() + ": " + (cat.getSatiety() ? "Сыт" : "Голоден"));
        System.out.println("Еды в миске " + bowl.getFoodAmount() + " Аппетит кота " + Cat.getAppetite());

        System.out.println();
        bowl.addFood(25);
        cat.eat(bowl);
        System.out.println(cat.getNameAnimal() + ": " + (cat.getSatiety() ? "Сыт" : "Голоден"));
        System.out.println("Еды в миске " + bowl.getFoodAmount() + " Аппетит кота " + Cat.getAppetite());
    }
}
