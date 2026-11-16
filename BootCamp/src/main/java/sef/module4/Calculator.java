package sef.module4;

public class Calculator {

    private String calculatorType;

    public static final String CALC_TYPE_BASIC = "Basic";

    public Calculator() {
    }

    public Calculator(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    // Add
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Subtract (Handles absolute or conditional difference)
    public int subtract(int x, int y) {
        int diff = 0;

        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    public int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp *= numbers[i];
        }

        return temp;
    }

    public int divide(int x, int y) {
        int divValue = 0;

        if (y != 0) {
            divValue = x / y;
        }

        return divValue;
    }
}