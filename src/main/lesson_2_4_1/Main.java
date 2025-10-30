package lesson_2_4_1;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Animal cat1 = new Cat("Пушок");
        cat1.run(10);
        cat1.swim(5);

        System.out.println();
        Animal dog = new Dog("Тузик");
        dog.run(200);
        dog.swim(7);

        System.out.println();
        System.out.println("Количество животных: " + Animal.getCountAnimal());
        System.out.println("Количество котов: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());

        System.out.println();
        Cat[] cats = {new Cat("Мурзик", 10), new Cat("Матроскин", 5), new Cat("Бегемот", 20), new Cat("Гарфилд", 8)};
        Bowl bowl = new Bowl(15);
        System.out.print("В миске " + bowl.getFoodAmount() + " еды.");
        System.out.println("\nКормим котов:");
        for (Cat cat : cats) {
            cat.eat(bowl, cat.getAppetite());
        }

        System.out.println();
        bowl.addFood(45);
        System.out.println("\nКормим котов:");
        for (Cat cat : cats) {
            cat.eat(bowl, cat.getAppetite());
        }
    }

}
