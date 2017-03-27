package test.myapplicationtest.java;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/20/17.
 */

public class ArrayDemo2 {
    public static void passByReference(String a[]) {
        a[0] = "Changed";
    }

    public static void main(String args[]) {
        String[] b = {"Apple", "Mango", "Orange"};
        System.out.println("Before Function Call    " + b[0]);
        ArrayDemo2.passByReference(b);
        System.out.println("After Function Call    " + b[0]);
    }
}
