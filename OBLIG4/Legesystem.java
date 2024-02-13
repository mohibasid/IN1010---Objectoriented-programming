import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Legesystem {
    

    public static void main(String[] args) {
        try {
            LesFraFil("legedata.txt");
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil");
        }
        
    }


    public static void LesFraFil(String filnavn) throws Exception{
        File f = new File(filnavn);
        Scanner fscan = null;
        String linje;
        String del = "ingen";
        HashMap<Integer,Pasient> pasientMap = new HashMap<>();
        HashMap<Integer,Legemiddel> legemidlerMap = new HashMap<>();
        HashMap<Integer,Lege> LegeMap = new HashMap<>();


        try {
            fscan = new Scanner(f);
        } catch (Exception e) {
            System.out.println("Fant ikke filen!");
        }

      
        

        while(fscan.hasNextLine()){
            linje = fscan.nextLine();
            if(linje.startsWith("#")){
                if(linje.startsWith("# pasienter (navn")){
                    del = "pasienter";
                }
                else if(linje.startsWith("# Legemidler (navn")){
                    del = "legemidler";
                }
                else if(linje.startsWith("# Leger (navn")){
                    del = "leger";
                }
                else if(linje.startsWith("# Resepter (LegemiddelNummer")){
                    del = "resepter";
                }
            }
            else{
                System.out.println("Ugyldig format!" + linje);
            }

            if (del.equals("pasienter")){
                try {
                    String [] data = linje.strip().split(",");
                    String navn = data[1];
                    String fødselsnummer = data[2];
                    if(fødselsnummer.length() == 11){
                        Pasient nyPasient = new Pasient(navn, fødselsnummer);
                        pasientMap.put(nyPasient.hentId(), nyPasient);
                    }
                    else{
                        System.out.println("Feil lengde på fødselsnr");
                    }

                } catch (Exception e) {
                    System.out.println("Ugyldig format" + linje);
                }
            }

            System.out.println(pasientMap.toString());

            
        } 
    }
        

        
    }


    

    


