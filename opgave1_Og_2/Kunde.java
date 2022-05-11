package opgave1_Og_2;

public class Kunde implements Comparable<Kunde>{
    private String navn;
    private String efternavn;
    private int alder;

    public Kunde(String navn, String efternavn, int alder){
        this.navn = navn;
        this.efternavn = efternavn;
        this.alder = alder;
    }
    public String getNavn() {
        return this.navn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public int getAlder() {
        return alder;
    }

    // Opgave 4
    @Override
    public int compareTo(Kunde kunde) {
        int comp = efternavn.compareTo(kunde.getEfternavn());
        if (comp == 0) {
            comp = navn.compareTo(kunde.getNavn());
            if (comp==0) {
                comp = alder-kunde.getAlder();
            }
        }
        return comp;
    }

    @Override
    public String toString(){
        return getNavn();
    }
}
