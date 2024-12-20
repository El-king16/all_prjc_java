package Pats;

public class Cat extends Pet{

    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sleep(){
        System.out.println(name + " спит в коробке");
    }

    @Override
        public void play(){
            System.out.println(name + " играет с лучиком");
    }

    @Override
        public void sound(){
            System.out.println(name + ": Мяу!");
        }

    public void catchMouse(){
        System.out.println(name+ " поймал мышь");
    }
}
