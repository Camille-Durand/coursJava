import com.cda.classe.Habitation;
import com.cda.classe.Vehicule;

public class HomeCarTest {
    public static void main(String[] args) {
        /*
        Habitation home = new Habitation("Home",3,5,1);
        Habitation casa = new Habitation("Casa",4,6,2);
        Habitation haus = new Habitation("Haus",5,7,3);

        System.out.println("L’habitation : " + home.getNom() + " à une surface de: " + home.surface() + "m²");
        System.out.println("L’habitation : " + casa.getNom() + " à une surface de: " + casa.surface() + "m²");
        System.out.println("L’habitation : " + haus.getNom() + " à une surface de: " + haus.surface() + "m²");
         */

        Vehicule milletipla = new Vehicule("1000tipla",4,287);
        Vehicule motobylette = new Vehicule("Motobylette",2,150);
        Vehicule concept = new Vehicule("Concept",3,75);

        System.out.println("Le vehicule " + milletipla.getNom() + " est de type " + milletipla.detect());
        System.out.println("Le vehicule " + motobylette.getNom() + " est de type " + motobylette.detect());
        System.out.println("Le vehicule " + concept.getNom() + " est de type " + concept.detect());

        milletipla.boost();
        motobylette.boost();
        concept.boost();

        System.out.println("Le vehicule " + milletipla.getNom() + " possède une vitesse boostée de " + milletipla.getVitesse() + "km/h");
        System.out.println("Le vehicule " + motobylette.getNom() + " possède une vitesse boostée de " + motobylette.getVitesse() + "km/h");
        System.out.println("Le vehicule " + concept.getNom() + " possède une vitesse boostée de " + concept.getVitesse() + "km/h");

        System.out.println("Le véhicule le + rapide est: " + motobylette.plusRapide(concept));

    }
}
