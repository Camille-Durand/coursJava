import com.cda.game.Assassin;
import com.cda.game.Guerrier;
import com.cda.game.Partie;
import com.cda.game.Personnage;

public class Main {
    public static void main(String[] args) {
        Assassin anubis = new Assassin("Anubis",31,42,27,12);
        Guerrier gremlin = new Guerrier("Grem",23,15,21, 27);

        Partie party = new Partie(anubis,gremlin,5);
        System.out.println(party.game());
        }
}
