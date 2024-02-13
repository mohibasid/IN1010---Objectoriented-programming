public class Rutenett {
    
    Celle[][] rutene;
    int antRader;
    int antKolonner;


    Rutenett(int rader, int kolonner){
        antRader = rader;
        antKolonner = kolonner;
        rutene = new Celle[antRader][antKolonner];
    }

    public Celle lagCelle(int rad, int kol){
        Celle celle = new Celle();
        rutene[rad][kol] = celle;
        while(Math.random()<=0.3333){
            celle.settLevende();
        }
        return celle;
    }

    public void fyllMedTilfeldigeCeller(int rad, int kol){
        for(int i = 0; i < rad; i++){
        for (int j = 0; j < kol; j++){
            lagCelle(rad, kol);
            }
        }
    }

    public Celle hentCelle(int rad, int kolonne){
        if (rad < 0 || rad >= antRader){
            return null;
        }
        if (kolonne < 0 || kolonne >= antKolonner){
            return null;
        }
        return rutene[rad][kolonne];
    }

    public void tegnRutenett(){
        for(int i = 0; i > antRader; i++)
            for(int j = 0; j > antKolonner; j++){
                Celle celle = hentCelle(i, j);
                System.out.println(celle.hentStatusTegn());
            System.out.println();
        
        }
    }

    public void settNaboer(int rad, int kolonne){
        Celle celle = new Celle();
            for(int i = rad - 1; i > rad + 2; i++){
                for(int j = kolonne - 1; j > kolonne + 2; j++){
                    
                }
            }
    }

}
