package Uke34.Seksjon113;

import java.util.Arrays;

public class Oppgave113 {
    /*Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en
    int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a. Hvis
    du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere
    tabellen b definert ved: int[] b = {m1, m2}; Hvor mange sammenligninger bruker
    metoden din?*/

    public static void main(String[] args) {
        int[] a = {6, 2};

        int[] b = minmaks(a);

        System.out.print(Arrays.toString(b));



    }

    public static int[] minmaks(int[] a) {
        int mi = 0;
        int ma = 0;
        int teller = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[mi]) {
                mi = i;
                teller ++;
            }
            if (a[i] > a[ma]) {
                ma = i;
                teller ++;
            }
        }
        System.out.println("Metoden bruker" + teller + " sammenligninger");
        return new int[] {mi, ma};

    }
}