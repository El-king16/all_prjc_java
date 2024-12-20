package Pats;

public class Fish extends Pet{
    public Fish(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sleep(){
        System.out.println(name + " спит(че, рыбы спят?)");
    }

    @Override
    public void play(){
        System.out.println(name + " плавает");
    }

    @Override
    public void sound(){
        System.out.println(name + ": молчит(если бы она умела говорить, она бы что нибудь сказала про чью то мать...)");
    }
}
