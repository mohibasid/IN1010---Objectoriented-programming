public class Lege {
    String navn;
    
    Lege(String navn){
        this.navn = navn;
    }

    public String hentNavn(){
        return navn;
    }

    @Override
    public String toString(){
        return " Navn: " + navn;
    }

}
