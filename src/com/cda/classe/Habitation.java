package com.cda.classe;

public class Habitation {

    // attributs
    private String nom;
    private double longueur;
    private double largeur;
    private int nbrEtage;

    // constructeurs
    public Habitation(){
    }

    public Habitation(String nom, double longueur, double largeur, int nbrEtage){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbrEtage = nbrEtage;
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

    public double getNbrEtage(){
        return nbrEtage;
    }
    public void setNbrEtage(){
        this.nbrEtage = nbrEtage;
    }

    // Méthode
    public double surface(){
        return longueur * largeur * nbrEtage;
    }

}
