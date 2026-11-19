package sef.module7.activity;

// Needs to be completed
// This program accepts a user name and checks user's validity
// The user name is checked against an array of names.
public class CustomExceptionActivityTest {

    public static void main(String[] args) {
        CustomExceptionActivityTest test = new CustomExceptionActivityTest();
        try {
            test.validateUser("John"); // Valid user
            test.validateUser("Alice"); // Invalid user
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {

            if (validUsers[i].equals(name)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else {
            System.out.println("Welcome to Payroll program");
        }
    }
}
        // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
        // You may also have to declare this exception in the method signature using throws.

        // 4 - Else if flag is one, print a message "Welcome to Payroll program".



