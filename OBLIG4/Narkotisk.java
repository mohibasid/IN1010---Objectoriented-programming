public class Narkotisk extends Legemiddel {

    private int styrke;

    Narkotisk(String navn, int pris, double virkestoff, int id, int styrke) {
        super(navn, pris, virkestoff, id);
        this.styrke = styrke;
    }

    @Override
    public String toString(){
        return "Navn: " + navn + " ," + "Pris: " + pris + " ," + "Virkestoff: " + virkestoff + "\n" 
        + ", " + "id: " + id + " ," + "Styrke: " + styrke;

    }
    
}
