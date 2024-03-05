package Design_Patterns.Factory_Design_Pattern;

public class car implements vehicle{
    @Override
    public void createVehicle() {
       System.out.println("The name of this vehicle is car");
    }
}
