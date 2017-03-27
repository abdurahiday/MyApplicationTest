package test.myapplicationtest.oop.abstraction;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public class Fish extends Animal {

    public static void main(String[] args) {
        System.out.println("Fish");
        Fish fish = new Fish();
        fish.swim();
        fish.eat();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    void eat() {
        System.out.println("Eat corn");
    }
}
