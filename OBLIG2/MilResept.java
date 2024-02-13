public class MilResept extends Hvit {
    

    MilResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId){
        super(legemiddel, utskrivendeLege, pasientId, 3);
    }
    
    public int hentMilPris(){
        return legemiddel.pris = 0;
    }


}
