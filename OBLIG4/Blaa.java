public class Blaa extends Resept {

    Blaa(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit){
        super(legemiddel, utskrivendeLege, pasient, reit);
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
