package lesson_2_6;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addSubscriber(String subscriber, String number) {
        phoneBook.putIfAbsent(subscriber, new ArrayList<>());
        phoneBook.get(subscriber).add(number);
    }

    public List<String> getSubscriber(String subscriber) {
        return phoneBook.getOrDefault(subscriber, new ArrayList<>());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
