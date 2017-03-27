package test.myapplicationtest.oop.polymorphism.overloading;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public class IdCard {

    public void idTypeA(int idNum) {
        System.out.println("Method 1");
        System.out.println(idNum);
    }

    public void idTypeA(int idNum, String name) {
        System.out.println("Method 2");
        System.out.println(idNum);
        System.out.println(name);
    }
}
