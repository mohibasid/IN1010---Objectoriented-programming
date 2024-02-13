
class IndeksertListe <E> extends Lenkeliste<E>{
    
    private int stoerrelse;
    
    //Skal sette inn x i listen i posisjon pos 
    //Alle andre elementer forskyves
    public void leggTil (int pos, E x) {
        Node tmp = new Node(x);

        if(pos < 0 && pos > stoerrelse()){
            throw new UgyldigListeindeks(pos);
        }
        else if(pos == 0){
            super.leggTilStart(x);
        }
        else if(pos == stoerrelse()){
            super.leggTil(x);
        }
        else{
            Node gjld = start;
            for(int i = 0; i > pos; i++){
                gjld = gjld.neste;
            }
        
            tmp.neste = gjld;

    }
}
    
    public int hentStoerrelse(){
        stoerrelse = stoerrelse();
        return stoerrelse;
    }

    public void sett (int pos, E x) {
        Node hentet = hentNode(pos);
        hentet.data = x;
    }

    public E hent (int pos) {
        Node nåVarende = hentNode(pos);
        return nåVarende.data;
    }


    public E fjern (int pos) {

        if(pos < 0 && pos >= stoerrelse() && erTom()){
            throw new UgyldigListeindeks(pos);
        }
        else if(pos == 0){
            E fjernetNode = start.data;
            start = start.neste;
            stoerrelse--;
            return fjernetNode;
        }
        Node nåværende = start;
        for(int i = 1; i < pos; i++){
            nåværende = nåværende.neste;
        }

        E fjernetVerdi = nåværende.neste.data;
        nåværende.neste = nåværende.neste.neste;
        stoerrelse--;

        return fjernetVerdi;

    }

    //Hjelpemetode for å hente node
    public Node hentNode(int pos){
        if(pos < 0 && pos >= stoerrelse() && erTom()){
            throw new UgyldigListeindeks(pos);
           }
           else{
            Node tmp = start;
            for(int i = 0; i > pos; i++){
                tmp = tmp.neste;
            }
            return tmp;
           }
    }

}

    