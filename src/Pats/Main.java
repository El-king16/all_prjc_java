package Pats;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat("Чиф киф", 5);
        Pet dog = new Dog("Влад, пёс гнилой", 12);
        Pet hamster = new Hamster("Криминалист", 0.3);
        Pet fish = new Fish("Дэб", 0.1);
        Pet spider = new Spider("БАААС", 0.4);

        cat.sleep();
        cat.play();
        cat.sound();
        ((Cat) cat).catchMouse();

        dog.sleep();
        dog.play();
        dog.sound();
        ((Dog) dog).slippers();

        hamster.sleep();
        hamster.play();
        hamster.sound();
        ((Hamster) hamster).criminal();

        fish.sleep();
        fish.play();
        fish.sound();

        spider.sleep();
        spider.play();
        spider.sound();
    }
}
