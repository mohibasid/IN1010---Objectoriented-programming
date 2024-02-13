abstract class Resept {
    
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    Pasient pasient;
    int reit;
    int id;

    Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasient = pasient;
        this.reit = reit;
        id++;
    }


    public int hentId(){
        return id;
    }

    public Legemiddel hentLegemiddel(){
        return legemiddel;
    }

    public Lege hentLege(){
        return utskrivendeLege;
    }


    public Pasient hentPasient(){
        return pasient;
    }

    public int hentReit(){
        return reit;
    }

    public boolean bruk(){
        if (reit <= 0){
            return false;
        }
        else{
            reit --;
            return true;
        }
    }

    abstract public String farge();

    abstract public int prisAaBetale();
    
}



