package Design_Patterns.Abstract_Factory_Example_2;

import java.util.Scanner;

class BrandFactory {
    static BrandType getVehicleBrand(String vehicleBrand) {
        if(vehicleBrand.equals("BrandA")) {
            return new BrandA();
        } else if(vehicleBrand.equals("BrandB")) {
            return new BrandB();
        } else {
            return null;
        }
    }
}

interface BrandType {
    abstract Car createCar();
    abstract Bike createBike();
}

class BrandA implements BrandType {

    @Override
    public Car createCar() {
        return new BrandAcar();
    }

    @Override
    public Bike createBike() {
        return new BrandAbike();
    }

}

class BrandB implements BrandType {

    @Override
    public Car createCar() {
        return new BrandBcar();
    }

    @Override
    public Bike createBike() {
        return new BrandBbike();
    }

}



interface Car {
    abstract void carName();
}

class BrandAcar implements Car {

    @Override
    public void carName() {
        System.out.println("This is brand A car");
    }

}

class BrandBcar implements Car {

    @Override
    public void carName() {
        System.out.println("This is brand B car");
    }

}

interface Bike {
    abstract void bikeName();
}

class BrandAbike implements Bike {

    @Override
    public void bikeName() {
        System.out.println("This is brand A bike");
    }

}

class BrandBbike implements Bike {

    @Override
    public void bikeName() {
        System.out.println("This is brand B bike");
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the brand");
        String brandFactoryName = scanner.next();

        BrandType brandType = BrandFactory.getVehicleBrand(brandFactoryName);

        Bike bikeType = brandType.createBike();

        bikeType.bikeName();

    }
}
