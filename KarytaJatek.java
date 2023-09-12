package karytajatek;

import java.util.Scanner;

public class KarytaJatek {

    static String[] pakli = new String[21];
    static String[] t1 = new String[7];
    static String[] t2 = new String[7];
    static String[] t3 = new String[7];

    public static void main(String[] args) {
        kirak();
        jatek();

    }

    private static void jatek() {
        for (int i = 0; i < 3; i++) {

            System.out.println();
            System.out.println("");
            kever(melyik());

        }

        ezvolt(pakli[10]);
    }

    private static String[] kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < pakli.length; i++) {
            pakli[i] = szinek[i / 6] + " - " + ertekek[i % 6];
        }
        int db = 0;
        for (int i = 0; i < pakli.length; i++) {

            if (db == 3) {
                System.out.printf("\n");
                db = 0;
            }
            db++;
            System.out.printf(pakli[i] + "\t" + "\t");

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

    private static void kever(int valaszt) {
        switch (valaszt) {

            case 1:
                for (int i = 0; i < t1.length; i++) {
                    t1[i] = pakli[19 - ((i) * 3)];
                    t2[i] = pakli[18 - ((i) * 3)];
                    t3[i] = pakli[20 - ((i) * 3)];
                }
                for (int i = 0; i < t1.length; i++) {
                    System.out.printf("%-10s  %-10s  %5s", t1[i], t2[i], t3[i] + "\n");
                }
                break;
            case 2:
                for (int i = 0; i < t1.length; i++) {
                    t1[i] = pakli[18 - ((i) * 3)];
                    t2[i] = pakli[19 - ((i) * 3)];
                    t3[i] = pakli[20 - ((i) * 3)];
                }
                for (int i = 0; i < t1.length; i++) {
                    System.out.printf("%-10s  %-10s  %5s", t1[i], t2[i], t3[i] + "\n");
                }

                break;
            case 3:
                for (int i = 0; i < t1.length; i++) {
                    t1[i] = pakli[20 - ((i) * 3)];
                    t2[i] = pakli[19 - ((i) * 3)];
                    t3[i] = pakli[18 - ((i) * 3)];
                }
                for (int i = 0; i < t1.length; i++) {
                    System.out.printf("%-10s  %-10s  %5s", t1[i], t2[i], t3[i] + "\n");
                }
                break;

        }
    }

    private static void ezvolt(String eredmeny) {
        for (int i = 0; i < t1.length; i++) {
            pakli[19 - ((i) * 3)] = t1[i];
            pakli[18 - ((i) * 3)] = t2[i];
            pakli[20 - ((i) * 3)] = t3[i];
        }

        System.out.printf("\n\n" + "Ez volt az általad kiválasztott lap?: " + eredmeny + "\n");

    }
}
