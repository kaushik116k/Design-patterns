package Design_Patterns.Factory_Design_Pattern;

interface vehicle {
    abstract void createVehicle();
}

class bike implements vehicle{
    @Override
    public void createVehicle() {
       System.out.println("The name of this vehicle is bike");
    }
}

class car implements vehicle{
    @Override
    public void createVehicle() {
       System.out.println("The name of this vehicle is car");
    }
}
