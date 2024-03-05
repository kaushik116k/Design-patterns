package Design_Patterns.Factory_Design_Pattern;

import java.util.Scanner;

/// factory design pattern
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the vehicle type \'car\' or \'bike\'");
        String vehicleType = scanner.next();
        VehicleFactoryType vehicleFactoryType = new VehicleFactoryType();
        vehicle vehicle = vehicleFactoryType.getVehicle(vehicleType);
        vehicle.createVehicle();
    }
}
