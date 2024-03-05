package Design_Patterns.Factory_Design_Pattern;

public class bike implements vehicle{
    @Override
    public void createVehicle() {
       System.out.println("The name of this vehicle is bike");
    }
}