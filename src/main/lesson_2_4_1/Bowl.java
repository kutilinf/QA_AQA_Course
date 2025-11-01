package lesson_2_4_1;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    // Метод для уменьшения еды в миске
    public String decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return " Еда в миске уменьшилась на " + amount + " и осталось " + food + ".";
        } else {
            return " Недостаточно еды в миске! Требуется: " + amount + ", доступно: " + food;
        }
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        if (amount < 0) {
            System.out.println("В миску можно только добавить еды.");
        } else {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + food + " еды.");
        }
    }

    // Геттер для количества еды
    public int getFoodAmount() {return food;}

}