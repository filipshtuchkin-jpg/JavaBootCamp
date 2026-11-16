package DAY1;

public class MultiplicationTable {

    public static void main(String[] args) {


        for (int i = 11; i <= 20; i++) {
            System.out.println("Muliply Table for " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }

        }
    }
}
