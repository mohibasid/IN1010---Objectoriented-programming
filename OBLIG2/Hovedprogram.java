public class Hovedprogram {
    
    public static void main(String[] args) {
        
        //Skal opprette minimum en instans av alle klassene, men oppretter et par
        Narkotisk narko = new Narkotisk("Suis", 500, 5.4, 1, 4);
        Spesialist spes = new Spesialist("Allum", "323");
        MilResept mResept = new MilResept(narko,spes, 1);

        //Skriver ut relevant informasjon om alle opprettede objekter med toString() - metoden
        System.out.println(narko.toString());
        System.out.println(spes.toString());
        System.out.println(mResept.toString());



    }
}
