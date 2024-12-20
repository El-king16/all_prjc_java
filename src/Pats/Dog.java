package Pats;

public class Dog extends Pet{

    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sleep(){
        System.out.println(name + " спит у двери");
    }

    @Override
    public void play(){
        System.out.println(name + " играет с косточкой");
    }

    @Override
    public void sound(){
        System.out.println(name + ": Гав!");
    }

    public void slippers(){
        System.out.println(name + " принес тапочки");
    }
}
