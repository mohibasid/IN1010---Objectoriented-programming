abstract class Legemiddel{

    public final int id;
    public final String navn;
    public final double virkestoff;
    int pris;

    Legemiddel(String navn, int pris, double virkestoff, int id){
        this.navn = navn;
        this.virkestoff = virkestoff;
        this.id = id++;
        this.pris = pris;
    }

    public int hentPris(){
        return pris;
    }

    public void settNyPris(int nyPris){
        pris = nyPris;
    }

    @Override
    public String toString(){
        return "Navn: " + navn + " Pris: " + virkestoff + " Virkestoff: " + virkestoff +
        " pris: " + pris;
    }
}