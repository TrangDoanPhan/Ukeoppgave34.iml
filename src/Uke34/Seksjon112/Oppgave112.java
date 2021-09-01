package Uke34.Seksjon112;

public class Oppgave112 {

    //oppgave1
    /* Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til
    den minste verdien i en tabell. Hva ville metodekallet min(a) returnere med hvis a er
    tabellen i Figur 1.1.2?
    metodekallet min(a) vil returnere 6*/

    //oppgave 2

    public static void main(String[] args) {

        int [] a = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};

        int min_index = min(a);

        System.out.println(min_index);
    }


        static int min(int[] a) {

        int min_index = 0;

        for (int i = 1; i <= a.length; i++) {

            if(a[i] < a[min_index]) {
                min_index = i;
            }
        }
        return min_index;
    }

}

//oppgave3
/* Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen
til den første av dem. Hva må endres for at den skal returnere posisjonen til den siste?
I if-setningen vil man bytte til <=.
*/
