package opgave1_Og_2;

import java.util.ArrayList;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("Anders", "Andersen", 25);
        Kunde k2 = new Kunde("Børge", "Hove", 65);
        Kunde k3 = new Kunde("Charlotte", "Immersen", 50);
        Kunde k4 = new Kunde("Dennis", "Krogsgaard", 22);
        Kunde k5 = new Kunde("Erik", "Sviatchenko", 31);

        Kunde k6 = new Kunde("Ebbe", "Immersen", 20);

        ArrayList<Kunde> kunder = new ArrayList<>(Arrays.asList(k1, k2, k3, k4, k5));

        Kunde[] kundes = {k1, k2, k3, k4, k5, null, null, null};

        indsætKunde(kunder, k6);
        indsætCustomer(kundes,k6);

        System.out.println(kunder);
        System.out.println(Arrays.toString(kundes));

    }

    // Opgave 1
    public static void indsætKunde(ArrayList<Kunde> kunder, Kunde kunde) {
        int j = 0;
        boolean found = false;
        while (!found) {
            Kunde temp = kunder.get(j);
            if (temp.compareTo(kunde) > 0) {
                kunder.add(j, kunde);
                found = true;
            } else {
                j++;
            }
        }
    }
    // Opgave 2
    public static void indsætCustomer(Kunde[] kunder, Kunde kunde){
        int j = kunder.length - 1;
        while(j>=0 && kunder[j]==null) {
            j--;
        }
        j++;
        boolean found = false;
        while (!found && j >= 0){
            if(kunder[j -1].compareTo(kunde) > 0){
                kunder[j] = kunder[j-1];
                kunder[j - 1] = kunde;
                found = true;
            } else{
                kunder[j] = kunde;
            }
        }
    }
}

