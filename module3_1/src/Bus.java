public class Bus extends Car{
    private int passengers;

    public Bus(float top, float capacity) {
        super(top, capacity);
        this.passengers = 0;
    }

    public void passengerEnter(){
        this.passengers++;
    }

    public void passengerExit(){
        if(this.passengers > 0){
            this.passengers--;
        }
    }
}
