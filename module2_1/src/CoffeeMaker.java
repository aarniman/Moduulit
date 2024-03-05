public class CoffeeMaker {
    private String type;
    private int ml;
    private boolean paalla;

    public CoffeeMaker(){
        this.paalla = false;
    }

    public void OnOff(){
        this.paalla = !this.paalla;
    }

    public boolean isOn(){
        return this.paalla;
    }

    public void pickType(int num){
        if(isOn()){
            System.out.println("1. Normal 2. Espresso");
            if(num == 1){
                this.type = "Normal";
            } else if (num == 2) {
                this.type = "Espresso";
            }else{
                System.out.println("Valitse annetuista numeroista.");
            }
        }
    }

    public void pickAmount(int amo){
        if(isOn()){
            System.out.println("Anna kahvin määrä (10-80 ml)");{
                if(amo < 10 || amo > 80){
                    System.out.println("Anna parametrien sisällä oleva määrä.");
                }else{
                    this.ml = amo;
                }
            }
        }
    }
}
