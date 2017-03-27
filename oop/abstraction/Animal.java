package test.myapplicationtest.oop.abstraction;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public abstract class Animal {

    public void swim() {
        System.out.println("Swim");
    }

    public void run() {
        System.out.println("Run");
    }

    abstract void eat();
}
