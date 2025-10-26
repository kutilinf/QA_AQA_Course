package lesson_2_4_1;

public class Bowl {
    private int food;
    public Bowl(int food) {
        this.food = food;
    }

    // Метод для уменьшения еды в миске
    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            System.out.println("Еда в миске уменьшилась на " + amount + ". Осталось: " + food);
            return true;
        } else {
            System.out.println("Недостаточно еды в миске! Требуется: " + amount + ", доступно: " + food);
            return false;
        }
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        food += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске: " + food);
    }

    // Геттер для количества еды
    public int getFoodAmount() {
        return food;
    }
}
