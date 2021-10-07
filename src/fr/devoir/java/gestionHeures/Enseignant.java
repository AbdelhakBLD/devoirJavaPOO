package fr.devoir.java.gestionHeures;

public abstract class Enseignant {
    protected String nom, prenom;
    protected int heuresCours;

    public Enseignant(String n, String p, int h) {
        this.nom = n;
        this.prenom = p;
        this.heuresCours = h;
    }
}
