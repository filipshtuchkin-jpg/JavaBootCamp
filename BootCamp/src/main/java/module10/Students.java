package module10;

// Student class extends Person

public class Students extends Person {

    private String schoolName;

    // getter for school name
    public String getSchoolName() {
        return schoolName;
    }

    // setter for school name
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // method to introduce Students
    @Override
    public void introduce() {
        System.out.println("I am study in University " + schoolName);

    }
}
