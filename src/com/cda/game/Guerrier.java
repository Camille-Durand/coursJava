package com.cda.game;

public class Guerrier extends Personnage{
    private int bonusDefense;

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense){
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense(){
        return bonusDefense;
    }
    public void setBonusDefense(int bonusDefense){
        this.bonusDefense = bonusDefense;
    }

    public void attaquer(Personnage cible){
        double luckyAttaque = Math.random();

        if(luckyAttaque > 0 && luckyAttaque <= 0.05){
            System.out.println("Bonus de défense pour " + this.getNom() + "!");
            cible.setVie(cible.getVie() - (this.getAttaque() - cible.getDefense()));
            this.setVie(this.getVie() + this.bonusDefense);
        } else {
            cible.setVie(cible.getVie() - (this.getAttaque() - cible.getDefense()));
        }
    }
}
