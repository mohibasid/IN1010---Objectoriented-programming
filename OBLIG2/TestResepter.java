public class TestResepter {
    
    public static void main(String[] args) {
        Vanlig l1 = new Vanlig("sis", 500, 2.3, 1); 
        
        Blaa blaaResept = new Blaa(l1, null, 0, 0);
        System.out.println(blaaResept.prisAaBetale());

        Lege lege1 = new Lege("Per");
        MilResept mResept = new MilResept(l1, lege1, 2);
        System.out.println(mResept.hentReit());

        Presepter pResepter = new Presepter(l1, lege1, 3, 2);
        System.out.println(pResepter.prisPresept());
    }
}
