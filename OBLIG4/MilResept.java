public class MilResept extends Hvit {
    

    MilResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient){
        super(legemiddel, utskrivendeLege, pasient, 3);
    }
    
    public int hentMilPris(){
        return legemiddel.pris = 0;
    }


}
