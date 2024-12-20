package Flower;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Flower> flowers;
    private List<Bouquet> bouquets;

    public Warehouse() {
        this.flowers = new ArrayList<>();
        this.bouquets = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addBouquet(Bouquet bouquet) {
        bouquets.add(bouquet);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Bouquet> getBouquets() {
        return bouquets;
    }

    @Override
    public String toString() {
        return "Склад{цветы = " + flowers + ", букет = " + bouquets + "}";
    }
}
