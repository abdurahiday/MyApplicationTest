package test.myapplicationtest.oop.polymorphism.overriding;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public class Car extends Vehicle {

    public void move () {
        super. move (); // invokes the super class method
        System.out.println ("Car");
    }
}