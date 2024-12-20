package Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private int maxFlowers;
    private List<Flower> flowers;

    public Bouquet(int maxFlowers) {
        this.maxFlowers = maxFlowers;
        this.flowers = new ArrayList<>();
    }

    public boolean addFlower(Flower flower){
        if (flowers.size() < maxFlowers) {
            flowers.add(flower);
            return true;
        }
        System.out.println("Букет достиг максимального количества цветов!");
        return false;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public String toString() {
        return "Букет{максимальное количество цветов = " + maxFlowers + ", цветы = " + flowers + "}";
    }
}
