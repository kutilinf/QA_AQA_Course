package lesson_2_3;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.getProductInformation();
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Tecno SPARK GO 1", "20.02.2024", "Tecno", "China", 4999, true);
        productsArray[2] = new Product("Realme Note 60x", "25.05.2024", "Realme", "China", 5399, true);
        productsArray[3] = new Product("Coolpad Cool 20+", "01.02.2025", "Coolpad", "China", 5599, true);
        productsArray[4] = new Product("Xiaomi REDMI A5", "01.02.2025", "Xiaomi", "China", 5999, true);
        System.out.println();

        Park sochiPark = new Park("sochiPark", "9:00", "20:00");
        sochiPark.addAttraction("Жар птица", "10:00", "20:00", 1000);
        sochiPark.addAttraction("Змей горыныч", "10:00", "20:00", 1500);
        sochiPark.showAllAttractions();
        System.out.println();

        Park skyPark = new Park("skyPark", "10:00", "17:00");
        skyPark.addAttraction("Скайбридж", "10:00", "20:00", 500);
        skyPark.addAttraction("Веревочный парк", "10:00", "20:00", 1000);
        skyPark.showAllAttractions();
        System.out.println();
    }

}
