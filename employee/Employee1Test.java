package test.myapplicationtest.employee;

/**
 * Created by ruma on 3/9/17.
 */

public class Employee1Test {
    public static void main(String args[]) {
      /* Create two objects using constructor */
        Employee1 empOne = new Employee1("James Smith");
        Employee1 empTwo = new Employee1("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
