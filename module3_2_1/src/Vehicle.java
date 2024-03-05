public interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

class Car implements Vehicle{

    private String model;

    public Car(String model){
        this.model = model;
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
    public String getInfo() {
        return this.model;
    }
}

class Motorcycle implements Vehicle{

    private String model;

    public Motorcycle(String model){
        this.model = model;
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
    public String getInfo() {
        return this.model;
    }
}

class Bus implements Vehicle{

    private String model;

    public Bus(String model){
        this.model = model;
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
    public String getInfo() {
        return this.model;
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        Car audi = new Car("E-Tron Q4");
        Motorcycle yamaha = new Motorcycle("XSR900 GP");
        Bus nobina = new Bus("Nro. 65");

        audi.start();
        audi.stop();
        System.out.println(audi.getInfo());

        yamaha.start();
        yamaha.stop();
        System.out.println(yamaha.getInfo());

        nobina.start();
        nobina.stop();
        System.out.println(nobina.getInfo());

    }
}
