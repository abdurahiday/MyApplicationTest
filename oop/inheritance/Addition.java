package test.myapplicationtest.oop.inheritance;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public class Addition extends Calculation {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Addition add = new Addition();
        add.addition(a, b);
    }
}
