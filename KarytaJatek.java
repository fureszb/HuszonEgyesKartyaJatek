package karytajatek;

import java.util.Scanner;

public class KarytaJatek {

    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezvolt();
    }

    private static int[] kirak() {
        int[] kartyak = new int[21];

        return kartyak;
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

    private static void ezvolt() {
        
    }

}
