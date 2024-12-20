package Exam;

import java.util.ArrayList;
import java.util.List;

public class Storehouse {
    private final int capacity;
    private final List<Order> storage;

    public Storehouse(int capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
    }

    public boolean addPizza(Order order) {
        if (storage.size() < capacity) {
            storage.add(order);
            return true;
        }
        return false;
    }

    public Order takePizza() {
        if (!storage.isEmpty()) {
            return storage.remove(0);
        }
        return null;
    }

    public boolean isFull() {
        return storage.size() == capacity;
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }
}





