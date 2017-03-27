package test.myapplicationtest.oop.abstraction.testRabbit;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/27/17.
 */

public class Molly extends Kelinci implements KelinciPelukis {

    public static void main(String[] args) {
        System.out.print("Molly's hobby is ");
        Molly molly = new Molly();
        molly.painting();
    }

    @Override
    public void painting() {
        System.out.println("Painting every Friday");
    }
}
