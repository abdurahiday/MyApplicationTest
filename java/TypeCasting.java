package test.myapplicationtest.java;

public class TypeCasting {
    public static void main(String args[]) {

        byte b;
        int i = 270;
        double d = 128.128;

        System.out.println("int converted to byte");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\ndouble converted to int");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\ndouble converted to byte");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
