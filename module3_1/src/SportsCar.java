public class SportsCar extends Car{

    public SportsCar(float top, float capacity) {
        super(top, capacity);
    }


    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.setSpeed(getSpeed() + 20);
            lessGasoline(15);
        }else
            super.setSpeed(0);
    }

    @Override
    public void decelerate(){
        if(getGasolineLevel() > 0){
            setSpeed(Math.max(0, getSpeed() - 20));
            lessGasoline(15);
        }else{
            setSpeed(0);
        }
    }
}
