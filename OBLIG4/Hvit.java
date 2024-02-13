public class Hvit extends Resept {
    
    Hvit(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit){
        super(legemiddel, utskrivendeLege, pasient, reit);
    }

    @Override
    public String farge(){
        return "Hvit";
    }

    @Override
    public int prisAaBetale(){
        return legemiddel.pris;
    }
}
