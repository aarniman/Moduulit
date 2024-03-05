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
        if (gasolineLevel > 0) {
            speed += 10;
            if(gasolineLevel < 10){
                gasolineLevel = 0;
            }else {
                gasolineLevel -= 10;
            }
        }else
            speed = 0;
    }
    void decelerate() {
        if (gasolineLevel > 0){
            speed = Math.max(0, speed - 10);
            if(gasolineLevel < 10){
                gasolineLevel = 0;
            }else {
                gasolineLevel -= 10;
            }
        }else{
            setSpeed(0);
        }
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

    public void setSpeed(float speed){
        this.speed = speed;
    }

    public void lessGasoline(int amount){
        if (gasolineLevel < amount){
            gasolineLevel = 0;
        }else{
            gasolineLevel -= amount;
        }
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
                decelerate();
            }


        }
    }
}
