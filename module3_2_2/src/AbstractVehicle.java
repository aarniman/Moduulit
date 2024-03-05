public abstract class AbstractVehicle implements Vehicle {
    private String model;
    private String colour;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    abstract String getColour();

    @Override
    public String getInfo() {
        return model;
    }
}

interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

class Car extends AbstractVehicle {

    private String model;
    private String colour;

    public Car(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    @Override
    public void start() {
        System.out.println("Car is starting....");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping....");

    }

    @Override
    String getColour() {
        return colour;
    }

    @Override
    public String getInfo() {
        return this.model;
    }
}

class Motorcycle extends AbstractVehicle{

    private String model;
    private String colour;

    public Motorcycle(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting....");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping....");
    }

    @Override
    String getColour() {
        return colour;
    }

    @Override
    public String getInfo() {
        return this.model;
    }
}

class Bus extends AbstractVehicle{

    private String model;
    private String colour;

    public Bus(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting....");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping....");
    }

    @Override
    String getColour() {
        return colour;
    }

    @Override
    public String getInfo() {
        return this.model;
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        Car audi = new Car("E-Tron Q4", "gray");
        Motorcycle yamaha = new Motorcycle("XSR900 GP", "Red");
        Bus nobina = new Bus("Nro. 65", "Blue");

        audi.start();
        audi.stop();
        System.out.println("Car's colour is " + audi.getColour());
        System.out.println(audi.getInfo());

        yamaha.start();
        yamaha.stop();
        System.out.println("Motocycles's colour is " + yamaha.getColour());
        System.out.println(yamaha.getInfo());

        nobina.start();
        nobina.stop();
        System.out.println("Bus's colour is " + nobina.getColour());
        System.out.println(nobina.getInfo());

    }
}

