package module10;
// main class to test Bike and Car

public class InterfaceActivityClass {
// main methid

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Car car = new Car();
        car.start();
        car.stop();
    }
}
