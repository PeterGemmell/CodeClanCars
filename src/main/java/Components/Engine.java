package Components;

public class Engine {

    private int litre;
    private int voltage;

    public Engine(int litre, int voltage){
        this.litre = litre;
        this.voltage = voltage;

    }

    public int getSize(){
        return litre;
    }

    public int getVoltageSize(){
        return voltage;
    }
}
