package test.myapplicationtest.oop.polymorphism.overloading;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public class IdCardA {

    public static void main(String[] args) {
        IdCard idCard = new IdCard();
        idCard.idTypeA(1111);
        System.out.println();
        idCard.idTypeA(2222, "Rahman");
    }
}
