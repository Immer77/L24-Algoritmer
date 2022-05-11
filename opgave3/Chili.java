package opgave3;

public class Chili implements Measurable{
    private double scoville;

    public Chili(double scoville){
        this.scoville = scoville;
    }

    public double getScoville() {
        return scoville;
    }

    @Override
    public double getMeasure() {
        return scoville;
    }

    @Override
    public String toString(){
        return "" + scoville;
    }
}
