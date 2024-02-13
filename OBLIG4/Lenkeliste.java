import java.util.Iterator;
import java.util.NoSuchElementException;


public abstract class Lenkeliste <E> implements Liste<E>{

    //Lager den indre klassen for elementene i listen : "nodene"
    protected class Node{
        //Har peker til neste node-objekt
        Node neste = null;
        //Holder på data
        E data;
        //Konstruktør
        Node(E x){
            data = x;
        }
    }

     //Referanse til start-noden
     protected Node start = null;
    

    //Lager LenkelisteIterator som en indre klasse
    protected class LenkelisteIterator implements Iterator<E> {

        
        @Override
        public boolean hasNext(){
            return start != null;
        }

        @Override
        public E next(){
            Node tmp = start;
            start = start.neste;
            return tmp.data;
        }
        
        
    }
        
    public Iterator<E> iterator(){
        return new LenkelisteIterator();
    }



    //Metoden skal returnere stoerrelsen av lista
    @Override
    public int stoerrelse(){
        int teller = 0;
        //Lager en referanse til Node "peker"
        //som flyttes gjennom listen helt til vi når siste
        Node peker = start;
        while(peker != null){
            peker = peker.neste;
            teller++;
        }
        return teller;
    }

    //Metoden skal legge til et nytt element
    //På slutten av listen
    @Override
    public void leggTil(E x){
        Node ny = new Node(x);

        if(erTom()){
            start = ny;
        }
        while(start.neste != null){
            start = start.neste;
        }
        start.neste = ny;
    }

    //Metoden skal hente foerste elementet i lista
    @Override
    public E hent(){
        Node peker = start;
        if(stoerrelse() == 0){
            throw new NoSuchElementException("Tom");
        }
        if(peker != null){
            return peker.data;
        }
        return null;
    }

    //Fjerner første element i listen
    //NB! ikke behov for å gå gjennom lista
    @Override
    public E fjern(){
        Node peker = start;
        /* 
        for (int i = 0; i < stoerrelse(); i++){
            peker = peker.neste;
        }*/
        E res = peker.neste.data;
        peker.neste = peker.neste.neste;
        return res;
    }

    @Override
    public String toString(){
        String svar = "";
        Node peker = start;
        while(peker != null){
            peker = peker.neste;
            svar += peker.data;
        }
        return svar;
    }

    //Hjelpemetode for hvis listen er tom
    public boolean erTom(){
        return start == null;
    }
    
     //Legger til elementet først i listen
     public void leggTilStart(E x){
         Node ny = new Node(x);
         if(erTom()){
             start = ny;
         }
         else{
             start.neste = ny;
         }
         start = ny;
     }


     //Skal sette inn x i listen i posisjon pos 
    //Alle andre elementer forskyves
    public void leggTil (int pos, E x) {
        Node tmp = new Node(x);

        if(pos < 0 && pos > stoerrelse()){
            throw new UgyldigListeindeks(pos);
        }
        else if(pos == 0){
            leggTilStart(x);
        }
        else if(pos == stoerrelse()){
            leggTil(x);
        }
        else{
            Node gjld = start;
            for(int i = 0; i > pos; i++){
                gjld = gjld.neste;
            }
        
            tmp.neste = gjld;

        }
    }
}
