package DAY1;

public class FindInArray {

    public static void main(String[] args) {
        int[] numbers = {100, 1, 4, 15};
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }

        System.out.println("Number - " + result);
    }
}