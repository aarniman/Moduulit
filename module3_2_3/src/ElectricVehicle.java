public interface ElectricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, ElectricVehicle{
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

    @Override
    public void charge() {
        System.out.println("Can't charge bus. " + model + " has a combustion engine.");
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

    @Override
    public void charge() {
        System.out.println("Can't charge motorcycle. " + model + " has a combustion engine.");
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

    @Override
    public void charge() {
        System.out.println("Can't charge bus. " + model + " has a combustion engine.");
    }
}

class ElectricCar extends AbstractVehicle {

    private String model;
    private String colour;

    public ElectricCar(String model, String colour){
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

    @Override
    public void charge() {
        System.out.println(this.model + " is fully charged!");
    }
}

class ElectricMotorcycle extends AbstractVehicle{

    private String model;
    private String colour;

    public ElectricMotorcycle(String model, String colour){
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

    @Override
    public void charge() {
        System.out.println(this.model + " is fully charged!");
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        Car audi = new Car("Q4", "gray");
        ElectricCar eAudi = new ElectricCar("E-Tron Q4", "Green");
        Motorcycle yamaha = new Motorcycle("XSR900 GP", "Red");
        ElectricMotorcycle eYamaha = new ElectricMotorcycle("PES 1", "Black");
        Bus nobina = new Bus("Nro. 65", "Blue");

        audi.start();
        audi.stop();
        System.out.println("Car's colour is " + audi.getColour());
        System.out.println(audi.getInfo());

        System.out.println();

        audi.charge();
        eAudi.charge();

        System.out.println();

        yamaha.start();
        yamaha.stop();
        System.out.println("Motocycles's colour is " + yamaha.getColour());
        System.out.println(yamaha.getInfo());

        System.out.println();

        yamaha.charge();
        eYamaha.charge();

        System.out.println();

        nobina.start();
        nobina.stop();
        System.out.println("Bus's colour is " + nobina.getColour());
        System.out.println(nobina.getInfo());

    }
}

