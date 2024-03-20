import com.cda.game.Assassin;
import com.cda.game.Guerrier;
import com.cda.game.Partie;
import com.cda.game.Personnage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Joueur 1:");

        Scanner scannerNomJ1 = new Scanner(System.in);
        System.out.print("Nom: ");
        String nomJ1 = scannerNomJ1.nextLine();
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

        Scanner scannerNomJ2 = new Scanner(System.in);
        System.out.print("Nom: ");
        String nomJ2 = scannerNomJ2.nextLine();
        Scanner scannerVieJ2 = new Scanner(System.in);
        System.out.print("PV: ");
        int vieJ2 = scannerVieJ2.nextInt();
        Scanner scannerAttaqueJ2 = new Scanner(System.in);
        System.out.print("Pts d'attaque: ");
        int attaqueJ2 = scannerAttaqueJ2.nextInt();
        Scanner scannerDefenseJ2 = new Scanner(System.in);
        System.out.print("Pts de défense: ");
        int defenseJ2 = scannerDefenseJ2.nextInt();

        System.out.println("*** ** *");
        Scanner scannerTour = new Scanner(System.in);
        System.out.print("Nombre de tours: ");
        int tour = scannerTour.nextInt();

        System.out.println("***** **** *** ** *");

        Assassin j1 = new Assassin(nomJ1,vieJ1,attaqueJ1,defenseJ1,12);
        Guerrier j2 = new Guerrier(nomJ2,vieJ2,attaqueJ2,defenseJ2, 27);

        Partie game = new Partie(j1,j2,tour);
        System.out.println(game.lancerPartie());
        }
}
