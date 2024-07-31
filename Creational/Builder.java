package Creational;

 class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;

    public CarBuilder withMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder withYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(make, model, year, color);
    }
}
   class Car {
	    private final String make;
	    private final String model;
	    private final int year;
	    private final String color;

	    public Car(String make, String model, int year, String color) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	    }

	    @Override
	    public String toString() {
	        return "Car{" +
	                "make='" + make + '\'' +
	                ", model='" + model + '\'' +
	                ", year=" + year +
	                ", color='" + color + '\'' +
	                '}';
	    }
	}

public class Builder {

	public static void main(String[] args) {
		Car car = new CarBuilder()
                .withMake("Toyota")
                .withModel("Camry")
                .withYear(2022)
                .withColor("Blue")
                .build();

        System.out.println(car.toString());// TODO Auto-generated method stub

	}

}
