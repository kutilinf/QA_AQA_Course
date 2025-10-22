package Lesson_2_3;

public class Park {
    public String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        public String attractionName;
        public String openingHours;
        public int cost;

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
