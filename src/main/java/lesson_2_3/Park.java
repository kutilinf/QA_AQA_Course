package lesson_2_3;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private String openingHours;
    private String closeHours;
    private int price;
    private List<Attraction> attractions;

    public Park(String parkName, String openingHours, String closeHours) {
        this.parkName = parkName;
        this.openingHours = openingHours;
        this.closeHours = closeHours;
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String attractionName;
        private String openingHours;
        private String closeHours;
        private int price;

        public Attraction(String attractionName, String openingHours, String closeHours, int price) {
            this.attractionName = attractionName;
            this.openingHours = openingHours;
            this.closeHours = closeHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + attractionName +
                    ", Время работы: " + openingHours + " - " + closeHours + ", Стоимость: " + price + " руб.");
        }
    }

    public void addAttraction(String attractionName, String openingHours, String closeHours, int price) {
        Attraction newAttraction = new Attraction(attractionName, openingHours, closeHours, price);
        attractions.add(newAttraction);
        //System.out.println("Аттракцион '" + attractionName + "' добавлен в парк '" + parkName + "'");
    }

    public void showAllAttractions() {
        System.out.println("Аттракционы парка '" + parkName + "'");
        if (attractions.isEmpty()) {
            System.out.println("Аттракционов нет");
            return;
        }
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
        }
    }

}
