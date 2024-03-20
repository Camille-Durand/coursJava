import com.cda.game.Assassin;
import com.cda.game.Guerrier;
import com.cda.game.Partie;
import com.cda.game.Personnage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Joueur 1:");

        Scanner scannerVieJ1 = new Scanner(System.in);
        System.out.print("PV: ");
        int vieJ1 = scannerVieJ1.nextInt();
        Scanner scannerAttaqueJ1 = new Scanner(System.in);
        System.out.print("Pts d'attaque: ");
        int attaqueJ1 = scannerAttaqueJ1.nextInt();
        Scanner scannerDefenseJ1 = new Scanner(System.in);
        System.out.print("Pts de défense: ");
        int defenseJ1 = scannerDefenseJ1.nextInt();

        System.out.println("*** ** *");
        System.out.println("Joueur 2:");

        Scanner scannerVieJ2 = new Scanner(System.in);
        System.out.print("PV: ");
        int vieJ2 = scannerVieJ2.nextInt();
        Scanner scannerAttaqueJ2 = new Scanner(System.in);
        System.out.print("Pts d'attaque: ");
        int attaqueJ2 = scannerAttaqueJ2.nextInt();
        Scanner scannerDefenseJ2 = new Scanner(System.in);
        System.out.print("Pts de défense: ");
        int defenseJ2 = scannerDefenseJ2.nextInt();

        System.out.println("***** **** *** ** *");

        Assassin anubis = new Assassin("Joueur 1",vieJ1,attaqueJ1,defenseJ1,12);
        Guerrier gremlin = new Guerrier("Joueur 2",vieJ2,attaqueJ2,defenseJ2, 27);

        Partie game = new Partie(anubis,gremlin,5);
        System.out.println(game.lancerPartie());
        }
}
