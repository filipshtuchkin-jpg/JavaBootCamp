package module10;
import java.util.List;

// Employee class that extends Person
public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    // 1 - default constructor for Employee class
    public Employee() {
    }

    // 2 - constructor for Employee class with parametrs

    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    // activity No.:4 adding constructor with only 3 parametrs
    public Employee(String jobTitle, String company, double salary) {

        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // getter for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // setter for jobTitle
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // getter for company
    public String getCompany() {
        return company;
    }

    //setter for company
    public void setCompany(String company) {
        this.company = company;
    }

    // getter for salary
    public double getSalary() {
        return salary;
    }

    // setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // method to introduce the person - employee
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + "and I am " + getAge() + " years old");
        System.out.println("I am work as a " + jobTitle + " in company " + company + " and my salary is " + salary);
    }
    // adding method to know Employee with highest salary

    public String getHighestPaidEmp (List<Employee> empList) {
        Employee highestPaid = empList.get (0);
        for (Employee emp : empList) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }
        return highestPaid.getName();
    }
}
