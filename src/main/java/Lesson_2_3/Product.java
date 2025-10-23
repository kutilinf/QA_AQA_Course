package Lesson_2_3;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean reservationStatus;

    public Product() {
        this.name = "default";
        this.productionDate = "дд.мм.гг";
        this.manufacturer = "unknown";
        this.countryOfOrigin = "unknown";
        this.price = 0;
        this.reservationStatus = false;
    }

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, int price, boolean reservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;
    }

    public void getProductInformation() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " + reservationStatus);
    }

}
