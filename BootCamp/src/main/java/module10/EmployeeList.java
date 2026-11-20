package module10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// create class with list of employees
public class EmployeeList {
//main Methid
    public static void main(String[] args) {

        Employee emp1 = new Employee("Manager", "Google", 50000);
        emp1.setName("Krishna");
        Employee emp2 = new Employee("CEO", "Microsoft", 80000);
        emp2.setName("Akhmed");
        Employee emp3 = new Employee("Ship Captain", "MSC", 100000);
        emp3.setName("Janis");
        Employee emp4 = new Employee("Developer", "Tesla", 35000);
        emp4.setName("Eelon");
        Employee emp5 = new Employee("President", "Meta", 500000);
        emp5.setName("Mark");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("The Employee whos salary is the highest is " + emp1.getHighestPaidEmp(employeeList));


    }
}


