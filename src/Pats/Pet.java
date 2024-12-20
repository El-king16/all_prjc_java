package Pats;

public abstract class Pet {
    protected String name;
    protected double weight;

    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void sleep();
    public abstract void play();
    public abstract void sound();

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


}
