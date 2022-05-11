package opgave3;

public class App {
    public static void main(String[] args) {
        Chili Jalapeno = new Chili(5000);
        Chili rødPeber = new Chili(10);
        Chili GhostPepper = new Chili(500000);
        Chili harbanero = new Chili(1000000);

        Measurable[] meas = {Jalapeno, rødPeber, GhostPepper, harbanero};
        System.out.println(max(meas));
        System.out.println(avg(meas));

    }
    public static Measurable max(Measurable[] objects){
        Measurable max = objects[0];
        for(Measurable m : objects){
            if(m.getMeasure() > max.getMeasure()){
                max = m;
            }
        }
        return max;

    }

    /**
     * Pre: Objects.length > 0
     * @param objects
     * @return
     */

    public static double avg(Measurable[] objects){
        double sum = 0.0;
        for(Measurable m : objects){
            sum = sum + m.getMeasure();
        }
        return sum / objects.length;
    }
}
