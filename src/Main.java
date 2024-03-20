import com.cda.game.Partie;
import com.cda.game.Personnage;

public class Main {
    public static void main(String[] args) {
        Personnage anubis = new Personnage("Anubis",31,42,27);
        Personnage gremlin = new Personnage("Grem",23,15,21);

        Partie party = new Partie(anubis,gremlin,5);
        System.out.println(party.game());
        }
}
