package Design_Patterns.Factory_Design_Pattern;

class GetVehicleType {

    public vehicle getVehicle(String vehicleType) {

        /// default vehicle will be bike
        vehicle vehicle = new bike();

        if(vehicleType.equalsIgnoreCase("bike")) {
            vehicle = new bike();
        } 

        if(vehicleType.equalsIgnoreCase("car")) {
            vehicle = new car();
        }

        return vehicle;
    }

}