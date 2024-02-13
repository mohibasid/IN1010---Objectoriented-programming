abstract class Resept {
    
    Legemiddel legemiddel;
    Lege utskrivendeLege;
    int pasientId;
    int reit;
    int id;

    Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
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


    public int hentPasientId(){
        return pasientId;
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



