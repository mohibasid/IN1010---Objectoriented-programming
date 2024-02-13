
public class Pasient {
    
    String navn;
    String fødselsnummer;
    int id;
    int teller = 1;
    Koe<Resept> resepter;

    Pasient(String navn, String fødselsnummer){
        this.navn = navn;
        this.fødselsnummer = fødselsnummer;
        id = teller++;
    }

    public void leggTilResept(Resept resept){
        resepter.leggTil(resept);
    }

    public int hentId(){
        return id;
    }

    public String toString(){
        return "Navn: " + navn + ", " + "fødselsnummer: " + fødselsnummer + ", " + "id: " + id;
    }

}
