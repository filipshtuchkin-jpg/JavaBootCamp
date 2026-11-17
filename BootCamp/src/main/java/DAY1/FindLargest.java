package DAY1;

public class FindLargest {

    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 20;

        int largest;

         if (num1 >= num2) {
            largest = num1;
         } else {
            largest = num2;
         }

          System.out.println("The largest number is: " + largest);
    }
}