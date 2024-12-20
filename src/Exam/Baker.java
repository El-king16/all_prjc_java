package Exam;


public class Baker {
    private final String name;

    public Baker(String name) {
        this.name = name;
    }

    public void bakePizza(Order order, Storehouse storehouse) {
        order.setStatus("Готовится");
        System.out.println("Пекарь " + name + " готовит пиццу: " + order);

        // завершение готовки
        order.setStatus("Готово");
        System.out.println(order);

        // добавление на склад
        while (!storehouse.addPizza(order)) {
            System.out.println("Склад заполнен. Пекарь " + name + " ждет освобождения места.");
        }
        System.out.println("Пекарь " + name + " добавил пиццу на склад: " + order);
    }
}



