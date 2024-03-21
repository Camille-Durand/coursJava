package com.cda.gameAgain;

import com.cda.game.Personnage;

public class Superman extends Personnage implements Competence{

    public Superman(String nom, int vie, int attaque, int defense){
        super(nom,vie,attaque,defense);
    }
    @Override
    public void attaquer(Personnage cible) {
        System.out.println(cible.getNom() + ": " + cible.getVie() + "PV");
        if(this.getAttaque() - cible.getDefense() > 0){
            cible.setVie(this.getAttaque() - cible.getDefense());
            System.out.println(this.getNom() + " attaque " + cible.getNom());
            System.out.println(cible.getNom() + ": " + cible.getVie() + "PV");
        }
    }
}
