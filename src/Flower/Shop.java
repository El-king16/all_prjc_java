package Flower;

import java.util.ArrayList;
import java.util.List;

public class Shop{
    private Warehouse warehouse;
    private List<Customer> customers;

    public Shop() {
        this.warehouse = new Warehouse();
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void createBouquet(int maxFlowers, List<Flower> flowers) {
        Bouquet bouquet = new Bouquet(maxFlowers);
        for (Flower flower : flowers) {
            bouquet.addFlower(flower);
        }
        warehouse.addBouquet(bouquet);
    }

    @Override
    public String toString() {
        return "Магазин{склад = " + warehouse + ", заказчик = " + customers + "}";
    }
}
