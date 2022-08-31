public class MinMaks {
    public static int maksIndeks(int[] a) { // a er en heltallstabell
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi
    }

    public static int maksVerdi(int[] a) { // a er en heltallstabell
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = a[0];  // foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > m) m = a[i];  // tallet oppdateres
        }

        return m;  // returnerer største verdi
    }

    public static int minIndeks(int[] a) { // a er en heltallstabell
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig minste verdi (m for minst)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til minste verdi
    }

    public static int minVerdi(int[] a) { // a er en heltallstabell
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = a[0];  // foreløpig største verdi (m for minst)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] < m) m = a[i];  // tallet oppdateres
        }

        return m;  // returnerer minste verdi
    }

    public static int[] minMaks (int[] a) {

        return new int[]{minIndeks(a), maksIndeks(a)};
    }

    public static long fak(int n) {
        int sum = 1;
        for (int i = n; i > 1 ; i--) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] liste = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int[] minMaksListe = {3, 1};

        System.out.println("Indeksen til det forrste storste tallet er: " + maksIndeks(liste));
        System.out.println("Verdien til det storste tallet er: " + maksVerdi(liste));

        System.out.println("Indeksen til det forste minste tallet er: " + minIndeks(liste));
        System.out.println("Verdien til det minste tallet er: " + minVerdi(liste));

        System.out.println(fak(1));

    }


}
