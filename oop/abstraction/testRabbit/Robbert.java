package test.myapplicationtest.oop.abstraction.testRabbit;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/27/17.
 */

public class Robbert extends Kelinci {

    public static void main(String[] args) {
        System.out.print("Robert's hobby is ");
        Robbert robbert = new Robbert();
        robbert.sleep();
    }

    public void sleep() {
        System.out.println("Sleep");
    }
}
