package module10;
//Bike class implements Vehicle
public class Bike implements Vehicle{
    // Method to start Bike
    @Override
    public void start (){
        System.out.println("Bike is starting");
    }
    //Method to stop Bike
    @Override
    public void stop (){
        System.out.println("Bike is stoping");
    }

}
