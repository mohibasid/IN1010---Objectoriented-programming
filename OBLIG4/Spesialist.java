public class Spesialist extends Lege implements Godkjenningsfritak {
    
    private String kontrollkode;

    Spesialist(String navn, String kontrollkode){
        super(navn);
        this.kontrollkode = kontrollkode;
    }

    @Override
    public String hentKontrollKode(){
        return kontrollkode;
    }

    @Override
    public String toString(){
        return "Navn: " + navn + " ," + " Kontrollkode: " + kontrollkode;
    }
}
