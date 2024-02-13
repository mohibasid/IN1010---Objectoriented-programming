public class Hvit extends Resept {
    
    Hvit(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
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
