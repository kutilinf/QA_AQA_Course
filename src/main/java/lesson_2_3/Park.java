package lesson_2_3;

public class Park {
    public String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String attractionName;
        private String openingHours;
        private int cost;

        public Attraction() {
            this.attractionName = "default";
            this.openingHours = "default";
            this.cost = 0;
        }

        public Attraction(String attractionName, String openingHours, int cost) {
            this.attractionName = attractionName;
            this.openingHours = openingHours;
            this.cost = cost;
        }
    }

}
