package test.myapplicationtest.employee;

/**
 * Created by ruma on 3/9/17.
 */

public class Employee3 {

    // salary  variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}
