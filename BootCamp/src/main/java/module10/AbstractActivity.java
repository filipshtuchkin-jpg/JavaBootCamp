package module10;

// main class for AbstractActivity
public class AbstractActivity {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Filips");
        employee.setAge(41);
        employee.setJobTitle("Manager");
        employee.setCompany("INFLOT");
        employee.setSalary(3000.00);


        employee.introduce();

        Students student = new Students();
        student.setSchoolName("Transport and Telecommunication Insitute");

        student.introduce();
    }
}