package Exam;

public class Courier {
    private final String name;
    private final int capacity;

    public Courier(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void deliverPizza(Storehouse storehouse) {
        for (int i = 0; i < capacity; i++) {
            Order order = storehouse.takePizza();
            if (order == null) {
                System.out.println("Курьер " + name + " ждет готовых пицц на складе.");
                break;
            }
            order.setStatus("Доставляется");
            System.out.println("Курьер " + name + " доставляет пиццу: " + order);

            // Имитация завершения доставки
            order.setStatus("Доставлено");
            System.out.println("Курьер " + name + " доставил пиццу: " + order);
        }
    }
}




