package module10;
// calculator class with basic mathematical operations
public class Calculator {

    // method to add numbers
    public  int add(int a, int b) {
        return a + b;
    }

    public  int add (int a, int b, int c) {
        return a + b + c;
    }
// method to substract numbers
    public int subtract(int a, int b) {
        return a - b;
    }
// method to divide numbers
    public double divide(int a, int b) {
        double result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");

        }
        return result;
    }
// method to muliplt positive numbers greater than 0
    public int multiply(int a, int b) {
        int result = 0;

        try {
            if (a <= 0 || b <= 0)
                throw new CustomException("Negative numbers and zero are not allowed");
            result = a * b;
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return result;

    }
}
