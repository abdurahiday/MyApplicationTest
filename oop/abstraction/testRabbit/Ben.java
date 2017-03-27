package test.myapplicationtest.oop.abstraction.testRabbit;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/27/17.
 */

public class Ben extends Kelinci implements KelinciPelukis {

    public static void main(String[] args) {
        System.out.print("Ben's hobby is ");
        Ben ben = new Ben();
        ben.painting();
    }

    @Override
    public void painting() {
        System.out.println("Painting every Monday");
    }
}
