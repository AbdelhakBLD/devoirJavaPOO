package fr.devoir.java.polygon;

import java.util.ArrayList;
import java.util.List;

public class Polygon {

    private static final Integer LONGUEURDUNCOTE = 10;
    private static Integer nombreInstancePolygon = 0;
    private Integer nombreDecote = 0;
    private Integer perimetrePolygon = 0;

    public Polygon() {
    }

    public Polygon(Integer nombreDecote) {
        this.nombreDecote = nombreDecote;
        this.perim();
        Polygon.nombreInstancePolygon++;
    }

    public Integer getNombreDecote() {
        return nombreDecote;
    }

    private void setNombreDecote(Integer nombreDecote) {
        this.nombreDecote = nombreDecote;
    }

    public static Integer getNombreInstancePolygon() {
        return nombreInstancePolygon;
    }

    public Integer getPerimetrePolygon() {
        return perimetrePolygon;
    }

    private void setPerimetrePolygon(Integer perimetrePolygon) {
        this.perimetrePolygon = perimetrePolygon;
    }

    public void perim() {
        Integer perimetre = this.getNombreDecote() * Polygon.LONGUEURDUNCOTE;
        this.setPerimetrePolygon(perimetre);
    }

    public void presqueClone(Integer nbCote) {
        this.setNombreDecote(this.getNombreDecote() + (nbCote));
        this.perim();
    }

    public static Polygon plusPetit(Polygon p1, Polygon p2) throws NullPointerException{
        Polygon petitPolgon = null;
        if (p1.getPerimetrePolygon() < p2.getPerimetrePolygon()) {
            petitPolgon = p1;
        } else if(p1.getPerimetrePolygon() > p2.getPerimetrePolygon()) {
            petitPolgon = p2;
        } else {
            throw new NullPointerException("les polygons sont égaux");
        }
        return petitPolgon;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "LONGUEURDUNCOTE=" + LONGUEURDUNCOTE +
                ", nombreDecote=" + nombreDecote +
                ", perimetrePolygon=" + perimetrePolygon +
                '}';
    }

    //      • créer des polygones,
    // appel à la classe polyone avec un objet de class
//      • compter le nombre de polygones créés,
    // ajouter dans le constructeur de polygon un index static
//      • afficher les caractéristiques d'un polygone,
    // tostring de la class
//      • calculer le périmètre d'un polygone,
    // methode de la class
//      • crée un polygone en ajoutant/enlevant des côtés à un polygone existant,

//      • comparer deux polygones et dire celui qui a le plus petit périmètre. Les étapes à suivre sont les suivantes :
}
