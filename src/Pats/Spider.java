package Pats;

public class Spider extends Pet{

    public Spider(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sleep(){
        System.out.println(name + " чилит в паутине");
    }

    @Override
    public void play(){
        System.out.println(name + " спасает нью йорк");
    }

    @Override
    public void sound(){
        System.out.println(name + ": думает как развалить всемирное сообщество гулей");
    }
}
