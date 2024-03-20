package com.cda.classe;

public class Vehicule {
    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule(){
    }
    public Vehicule(String nom, int nbrRoue, int vitesse){
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(){
        this.nom = nom;
    }

    public int getNbrRoue(){
        return nbrRoue;
    }
    public void setNbrRoue(){
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse(){
        return vitesse;
    }
    public void setVitesse(){
        this.vitesse = vitesse;
    }

    public void boost(){
        vitesse = vitesse + 50;
    }

    public String detect(){
        if(nbrRoue == 2){
            return "moto";
        } else if (nbrRoue == 4){
            return "vago";
        } else {
            return "autre";
        }
    }

    public String plusRapide(Vehicule vehicule){
        if(vehicule.vitesse > vitesse){
            return vehicule.getNom() + " (" + vehicule.vitesse + "km/h)";
        } else {
            return getNom() + " (" + vitesse + "km/h)";
        }
    }
}
