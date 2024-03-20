package com.cda.game;

public class Partie extends Personnage{
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    public Personnage getJoueur1(){
        return joueur1;
    }
    public void setJoueur1(Personnage joueur1){
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2(){
        return joueur2;
    }
    public void setJoueur2(Personnage joueur2){
        this.joueur2 = joueur2;
    }

    public int getNbrTour(){
        return nbrTour;
    }
    public void setNbrTour(int nbrTour){
        this.nbrTour = nbrTour;
    }

    public String game(){
        while(this.nbrTour != 0){
            System.out.println(joueur1.getNom() + " attaque " + joueur2.getNom() + "!");
            joueur1.attaquer(joueur2);

            System.out.println(joueur2.getNom() + " attaque " + joueur1.getNom() + "!");
            joueur2.attaquer(joueur1);

            nbrTour--;

            if(joueur2.getVie() <= 0 && joueur1.getVie() > 0){ // Victoire joueur1
                return "Fin de partie: " + joueur1.getNom() + " a gagné :)";
            } else if(joueur1.getVie() <= 0 && joueur2.getVie() > 0){ // Victoire joueur2
                return "Fin de partie: " + joueur2.getNom() + " a gagné :)";
            } else if(joueur2.getVie() <= 0 && joueur1.getVie() <= 0){ // Égalité
                return "Fin de partie: Égalité (vie à 0 pour les 2 joueurs)";
            }
        }
        return "Fin de partie: Égalité (fin de tours)";
    }
}
