package fr.devoir.java.polygon;

public class Main {

    public static void main(String[] args) {
        Polygon p1 = new Polygon(4);
        Polygon p2 = new Polygon(5);

        // doit afficher le polygon le plus petit
        try {
            System.out.println("test polygon plus petit : " + Polygon.plusPetit(p1, p2).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        p2.presqueClone(-1);
        System.out.println(p2.toString());

        // doit afficher NullPointerException avec un message comme quoi les polygons sont égaux
        try {
            System.out.println("test polygon plus petit : " + Polygon.plusPetit(p1, p2).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
