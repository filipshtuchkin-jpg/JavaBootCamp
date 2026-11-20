package module10;

// abstract class Person

public abstract class Person {
    private String name;
    private int age;

    // getter for name

    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        this.age = age;
    }
// method to introduce the person

    public abstract void introduce();
}

