public class Presepter extends Hvit{
    
    public static int rabatt = 108;

    Presepter(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    public int prisPresept(){
        int pris = 0;
        while(legemiddel.pris >= rabatt){
            pris = legemiddel.pris - rabatt;
        }
        return pris; 
    }
}
