public class TestLegemiddel {
    public static void main(String[] args) {
        
        Narkotisk narkotisk = new Narkotisk("sis", 20, 3.5, 1, 2);
        Vanedannende vanedannende = new Vanedannende("all", 30, 2.4, 3, 2);
        Vanlig vanlig = new Vanlig("bombom", 35, 2.1, 3);
    
        System.out.println(testLegemiddelId(vanlig, 3));
        System.out.println(testLegemiddelVirkestoff(narkotisk, 3.5));
        System.out.println(testLegemiddelId(vanedannende, 2));
        System.out.println(narkotisk.toString());
    }

    private static boolean testLegemiddelId(Legemiddel legemiddel, int foventetResultat){
        return legemiddel.id == foventetResultat;
    }

    private static boolean testLegemiddelVirkestoff(Legemiddel legemiddel, double forventetResultat){
        return legemiddel.virkestoff == forventetResultat;
    }
}
