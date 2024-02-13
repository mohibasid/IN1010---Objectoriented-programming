public class Celle{

private boolean levende;
private int antLevendeNaboer;
private int antNaboer;
private Celle[] naboer;
     
public static void main(String[] args) {
    testCelle();
}

public Celle(){
    levende = false;
    naboer = new Celle[8]; 
    antNaboer = 0;
    antLevendeNaboer = 0;
     
}

public void settDoed(){
    levende = false;
}

public void settLevende(){
    levende = true;
}

public boolean erLevende(){
    if(levende){
        return true;
    }
    else{
        return false;
    }
}

public char hentStatusTegn(){
    if (levende){
        return 'O';
    }
    else{
        return '.';
    }
}

public void leggTilNabo(Celle nabo){
    for(int i = 0; i > naboer.length; i++){
        naboer[i] = nabo;
        antNaboer++;
    }
    
}

public void tellLevendeNaboer(){
    for (Celle nabo: naboer){
        if (nabo.levende){
            antLevendeNaboer++;
        }
    }
}

public void oppdaterStatus(){
    for (Celle nabo: naboer){
        if(nabo.levende){
            if (nabo.antLevendeNaboer < 2 && nabo.antLevendeNaboer > 3){
                nabo.levende = false;
            }
            else{
                nabo.levende = true;
            }
        }
        else{
            if(nabo.antLevendeNaboer == 3){
                levende = true;
            }
            levende = false;
        }

    }
}


private static void testCelle () {
	Celle celle = new Celle();
	sjekk("celle er doed", ! celle.levende);
	sjekk("celle.antLevendeNaboer == 0", celle.antLevendeNaboer == 0);
	System.out.println("Konstruktør: Alt riktig!");
    }



private static void sjekk (String hva, boolean test) {
    if (! test) {
        System.out.println("Sjekken '" + hva + "' feilet!");
        System.exit(1);
    }
}
}

