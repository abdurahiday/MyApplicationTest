package test.myapplicationtest.oop.encapsulation;

/**
 * Created by abdurahman.hidayat@ruma.co.id on 3/22/17.
 */

public class Rahman {

    public static void main(String[] args) {
        EmployeeId employeeId = new EmployeeId();
        employeeId.setName("Rahman");
        employeeId.setIdNum(2222);
        employeeId.setDiv("IT");

        System.out.println(employeeId.getName());
        System.out.println(employeeId.getIdNum());
        System.out.println(employeeId.getDiv());
    }
}
