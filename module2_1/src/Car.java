public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float topSpeed;
    private float gasolineLevel;
    private float capacity;
    private String typeName;
    private boolean cruiserOn;
    private float cruiserTop, cruiserBtm, target;


    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    public Car(float top, float capacity){
        this.topSpeed = top;
        this.capacity = capacity;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    public void cruiserOffOn(){
        this.cruiserOn = !this.cruiserOn;
    }

    public boolean isCruiserOn(){
        return this.cruiserOn;
    }

    public void cruiserSpeed(float top, float btm, float targ){
        while(isCruiserOn()){
            this.cruiserTop = top;
            this.cruiserBtm = btm;
            this.target = targ;

            if(this.target > this.topSpeed){
                cruiserOffOn();
                break;
            }

            if(this.speed < targ){
                accelerate();
            }else if (this.speed == targ){

            }else{
                decelerate(10);
            }


        }
    }
}

class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}