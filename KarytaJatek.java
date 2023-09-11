package karytajatek;

import java.util.Scanner;

public class KarytaJatek {

    static String[] pakli = new String[21];

    public static void main(String[] args) {
        jatek();

    }

    private static void jatek() {
        for (int i = 0; i < 3; i++) {

            kirak();
            System.out.println();
            System.out.println("");
            kever(melyik());
            
           
        }
        
        ezvolt(kirak()[10]);
    }

    private static String[] kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < pakli.length; i++) {
            pakli[i] = szinek[i / 6] + " - " + ertekek[i % 6];
        }
        int db =0;
        for (int i = 0; i < pakli.length; i++) {
       
            if (db == 3) {
                System.out.printf("\n"); 
                db =0;
            }
            db++;
            System.out.printf(pakli[i]+"\t"+"\t");
           
        }
        return pakli;
    }

    private static int melyik() {
        Scanner sc = new Scanner(System.in);
        int valasz = 0;
        while ((valasz < 1) || (valasz > 3)) {
            System.out.print("Meliyk sorba van a választott lapod[1-3]?: ");
            valasz = sc.nextInt();
        }
 
        return valasz;

    }

    private static void kever( int valaszt) {
        switch (valaszt) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    pakli[i]=pakli[19-((i-1)*3)];
                    pakli[i+7]=pakli[18-((i-1)*3)];
                    pakli[i+14]=pakli[20-((i-1)*3)];  
                }
                
                break;
            case 2:
                
                break;
            case 3:
                for (int i = 1; i < 7; i++) {
                    pakli[i]=pakli[20-(i-1)*3];
                    pakli[i+7]=pakli[19-(i-1)*3];
                    pakli[i+14]=pakli[18-(i-1)*3];  
                }
                break;
        }
    }

    private static void ezvolt(String eredmeny) {
        System.out.printf("\n\n"+"Ez volt az általad kiválasztott lap?: " + eredmeny+"\n");
        
    }

}
