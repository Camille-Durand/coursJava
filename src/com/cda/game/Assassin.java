package com.cda.game;

public class Assassin extends Personnage{
    private int bonusAttaque;

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    public int getBonusAttaque(){
        return bonusAttaque;
    }
    public void setBonusAttaque(int bonusAttaque){
        this.bonusAttaque = bonusAttaque;
    }

    public void attaquer(Personnage cible){
        double luckyAttaque = Math.random();

        if(luckyAttaque <= 0.05){
            System.out.println("Bonus d'attaque pour " + this.getNom() + "!");
            cible.setVie(cible.getVie() - ((this.getAttaque() + this.bonusAttaque) - cible.getDefense()));
        } else {
            cible.setVie(cible.getVie() - (this.getAttaque() - cible.getDefense()));
        }
    }
}
