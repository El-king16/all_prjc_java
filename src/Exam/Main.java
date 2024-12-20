package Exam;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] bakerNames = {"Иван", "Андрей", "Сергей"};
        String[] courierNames = {"Маша", "Оля", "Коля", "Дима", "Света", "Вика"};

        Storehouse storehouse = new Storehouse(5);

        // Создаем пекарей
        List<Baker> bakers = new ArrayList<>();
        for (String name : bakerNames) {
            bakers.add(new Baker(name));
        }

        // Создаем закладчиков
        List<Courier> couriers = new ArrayList<>();
        for (String name : courierNames) {
            couriers.add(new Courier(name, 2));
        }

        // Создаем и обрабатываем заказы
        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orders.add(new Order());
        }

        // Чередуем работу пекарей и курьеров чтобы не было бесконеченого "Склад заполнен. Пекарь Иван ждет освобождения места."
        int currentOrderIndex = 0;
        int currentCourierIndex = 0;

        while (currentOrderIndex < orders.size() || !storehouse.isEmpty()) {
            // Пекари готовят пиццы
            if (currentOrderIndex < orders.size()) {
                Order order = orders.get(currentOrderIndex);
                Baker baker = bakers.get(currentOrderIndex % bakers.size());
                baker.bakePizza(order, storehouse);
                currentOrderIndex++;
            }

            // Курьеры доставляют пиццы
            if (!storehouse.isEmpty()) {
                Courier courier = couriers.get(currentCourierIndex % couriers.size());
                courier.deliverPizza(storehouse);
                currentCourierIndex++;
            }
        }

        System.out.println("Все заказы выполнены.");
    }
}




