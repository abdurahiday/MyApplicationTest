package test.myapplicationtest.java;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/20/17.
 */

public class ArrayDemo1 {

    public static void main(String args[]) {
        int myArray[] = new int[7];
        for (int count = 0; count < 7; count++) {
            myArray[count] = count + 1;
        }
        for (int count = 0; count < 7; count++) {
            System.out.println("array[" + count + "] = " + myArray[count]);
        }
//        System.out.println("Length of Array = " + myArray.length);
        myArray[8] = 10;
    }
}
