package module10;
//Car class implements Vehicle
public class Car implements Vehicle{
// Method to start Car
    @Override
    public void start (){
        System.out.println("Car is starting");
    }
    // Method to stop Car
    @Override
    public void stop (){
        System.out.println("Car is stoping");
    }

}
