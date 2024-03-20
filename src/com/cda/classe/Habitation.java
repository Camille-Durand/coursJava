package com.cda.classe;

public class Habitation {

    // attributs
    private String nom;
    private double longueur;
    private double largeur;

    // constructeurs
    public Habitation(){
    }

    public Habitation(String nom, double longueur, double largeur){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Getters Setters
    public String getNom(){
        return nom;
    }
    public void setNom(){
        this.nom = nom;
    }

    public double getLongueur(){
        return longueur;
    }
    public void setLongueur(){
        this.longueur = longueur;
    }

    public double getLargeur(){
        return largeur;
    }
    public void setLargeur(){
        this.largeur = largeur;
    }

    // Méthode
    public double surface(){
        return longueur * largeur;
    }

}
