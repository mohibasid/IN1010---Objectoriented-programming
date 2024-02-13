public class Koe<E> extends Lenkeliste<E> {
    

//Skal følge FIFO (First In First Out)
//Trenger ikke å redefinere noen metoder

//Nytt element legges til bakerst
public void leggTil(E x){
    super.leggTil(x);
}

//Første element fjernes 
public E fjern(){
    return super.fjern();
}


}
