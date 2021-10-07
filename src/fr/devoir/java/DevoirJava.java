package fr.devoir.java;

public class DevoirJava {

    private static final Double VALEURMILES = 1.609;

    public DevoirJava() {
    }

    public static double km_vers_miles(Double km) throws Exception {
        if (km.isNaN()) {
            throw new Exception();
        } else {
            return km * DevoirJava.VALEURMILES;
        }
    }

    public static int pgcd(int a, int b) {
        int intA = a;
        int intB = b;
        while (intA != intB) {
            if (intA > intB)
                intA = intA - intB;
            else
                intB = intB - intA;
        }
        return intB;
    }

    public static int sumNprem(int n) {
        int somme = 0;
        int nombre = 1;
        int i, r = 100;
        while (nombre < n) {
            r = 0;
            nombre++;
            for (i = 1; i <= nombre; i++) {
                if ((nombre % i) == 0)
                    r++;
            }
            if (r == 2)
            {
                somme += nombre;
                System.out.println(nombre);
            }
        }
        return somme;
    }

}
