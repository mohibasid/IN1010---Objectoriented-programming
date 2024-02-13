public class Stabel<E> extends Lenkeliste<E> {
    
    
    //Legger til elementet først i listen
    @Override
    public void leggTil(E x){
        Node ny = new Node(x);
        if(erTom()){
            start = ny;
        }
        else{
            start.neste = ny;
        }
        start = ny;
    }

    //Henter ut det første elementet i listen
    public E hent(){
        return super.hent();
    }

}
