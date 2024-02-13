
public class Prioritetskoe<E extends Comparable<E>> extends Lenkeliste<E> {
    
    E tmpVerdi;

   //Elementer settes inn sortert
   @Override
    public void leggTil(E x){
        if(stoerrelse() == 0){
            super.leggTil(x);
        }
        else{
            Node nåværende = start;
            int pos = 0;
            while(nåværende != null && x.compareTo(nåværende.data) > 0){
                nåværende = nåværende.neste;
                pos++;
            }
        
        if(pos == 0){
            super.leggTilStart(x);
        }
        else{
            super.leggTil(pos, x);
        }
    }
}

    //Henter ut det første/minste elementet
    public E hent(){
        return super.hent();
    }

    //Fjerner det første/minste elementet
    public E fjern(){
        return super.fjern();
    }

}
