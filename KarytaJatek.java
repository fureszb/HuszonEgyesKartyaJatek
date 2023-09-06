package karytajatek;

import java.util.Scanner;

public class KarytaJatek {

    static String[] pakli = new String[22];

    public static void main(String[] args) {
        jatek();
       
    }

    private static void jatek() {
        for (int i = 0; i < 3; i++) {
            
            kirak();
            melyik();
            kever();
        }
        //ezvolt(kirak()[10]);
    }

    private static String[] kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < pakli.length; i++) {
            pakli[i] = szinek[i/6] + " - " + ertekek[i% 6];
        }
        for (int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
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
        System.out.println(valasz);
        return valasz;

    }

    private static void kever() {

    }

    private static void ezvolt(String eredmeny) {
        System.out.printf("Ez volt az általad kiválasztott lap?: " + eredmeny);
    }

}
