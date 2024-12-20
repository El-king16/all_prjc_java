package Flower;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // Создаем цветы
        Flower rose = new Flower("Rose", 10.5, 4.8);
        Flower tulip = new Flower("Tulip", 7.0, 4.5);
        Flower lily = new Flower("Lily", 12.0, 4.9);

        // Добавляем цветы на склад
        shop.getWarehouse().addFlower(rose);
        shop.getWarehouse().addFlower(tulip);
        shop.getWarehouse().addFlower(lily);

        // Создаем букет и добавляем в него цветы
        shop.createBouquet(5, Arrays.asList(rose, tulip, lily));

        // Добавляем покупателей
        shop.addCustomer(new Customer("Alice", "alice@example.com"));
        shop.addCustomer(new Customer("Bob", "bob@example.com"));

        // Выводим информацию о магазине
        System.out.println(shop+"\n");
    }
}
