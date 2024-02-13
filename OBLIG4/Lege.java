public class Lege implements Comparable<Lege> {
    String navn;
    IndeksertListe<Resept> utskrevneResepter;
    
    Lege(String navn){
        this.navn = navn;
    }

    public String hentNavn(){
        return navn;
    }

    public int compareTo(Lege annen){
        return this.navn.compareTo(annen.navn);
    }

    @Override
    public String toString(){
        return " Navn: " + navn;
    }

    public IndeksertListe<Resept> hentResepter(){
        return utskrevneResepter;
    }

    public Hvit skrivHvitResept(Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        Hvit nyHvit = new Hvit(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyHvit);
        return nyHvit;
    }

    public MilResept skrivMilResept (Legemiddel legemiddel, Pasient pasient) throws UlovligUtskrift {
        MilResept nyMil = new MilResept(legemiddel, this, pasient);
        utskrevneResepter.leggTil(nyMil);
        return nyMil;
    }

    public Presepter skrivPResept (Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        Presepter nyP = new Presepter(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyP);
        return nyP;
    }

    public Blaa skrivBlaaResept (Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        Blaa nyBlaa = new Blaa(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(nyBlaa);
        return nyBlaa;
    }
    
    

}
