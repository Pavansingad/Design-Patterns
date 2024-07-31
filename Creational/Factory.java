package Creational;

interface Vehicle {
    void drive();
}

// Concrete products
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}

// Factory class
class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("truck")) {
            return new Truck();
        } else {
            throw new UnsupportedOperationException("Unsupported vehicle type");
        }
    }
}
public class Factory {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.createVehicle("car");
        car.drive(); // Output: Driving a car

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive(); // Output: Driving a truck// TODO Auto-generated method stub

	}

}
