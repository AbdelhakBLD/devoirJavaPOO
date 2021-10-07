package fr.devoir.java;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(DevoirJava.km_vers_miles(0.0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(DevoirJava.pgcd(3, 15));

        System.out.println(DevoirJava.sumNprem(17));


    }
}
