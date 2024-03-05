package Design_Patterns.Factory_Design_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the vehicle type \'car\' or \'bike\'");
        String vehicleType = scanner.next();
        GetVehicleType vehicleObject = new GetVehicleType();
        vehicle vehicle = vehicleObject.getVehicle(vehicleType);
        vehicle.createVehicle();
    }
}
