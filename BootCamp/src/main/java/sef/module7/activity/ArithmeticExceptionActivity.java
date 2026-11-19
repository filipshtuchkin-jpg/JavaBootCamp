package sef.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    // TODO: 1 - Type main method
    public static void main(String[] args) {
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);
        obj.catchMe(10, 2);
    }
    // TODO: 2 - Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0

    // TODO: 5 - Try to call catchMe with 10 and 2 now and see which messages get printed


    void catchMe(int num1, int num2) {
        // The following code results in an Exception.
        // TODO: 3 - Identify the exception and write code to handle this exception.
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }
        catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        // TODO: 4 - After handling the exception, write a finally block which
        // prints a message "Thank you for using this program."

    }
}