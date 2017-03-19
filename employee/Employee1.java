package test.myapplicationtest.employee;

/**
 * Created by ruma on 3/9/17.
 */

public class Employee1 {
    String name;
    int age;
    String designation;
    double salary;

    // This is the constructor of the class Employee1
    public Employee1(String name) {
        this.name = name;
    }

    // Assign the age of the Employee1  to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Assign the salary to the variable	salary.*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Print the Employee1 details */
    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}
