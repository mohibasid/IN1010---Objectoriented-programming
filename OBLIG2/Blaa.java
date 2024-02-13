public class Blaa extends Resept {

    Blaa(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge(){
        return "Blaa";
    }

    @Override
    public int prisAaBetale(){
        return (int)Math.round(legemiddel.pris * 0.25);
    }
    
}
