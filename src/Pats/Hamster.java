package Pats;

public class Hamster extends Pet{
    public Hamster(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sleep(){
        System.out.println(name + " спит в клетке");
    }

    @Override
    public void play(){
        System.out.println(name + " тапает");
    }

    @Override
    public void sound(){
        System.out.println(name + ": абаюмба");
    }

    public void criminal(){
        System.out.println(name + " спрятал еду");
    }
}
