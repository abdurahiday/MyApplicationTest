package test.myapplicationtest.java;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/20/17.
 */

public class ArrayDemo {

    public static void main(String args[]) {
        int array[] = new int[7];
        for (int count=0; count<7; count++) {
            array[count] = count + 1;
        }
        for (int count=0; count<7; count++) {
            System.out.println("array[" + count + "] = " + array[count]);
        }
        System.out.println("Length of Array = "+ array.length);
        array[8] = 10;
    }
}
