import com.cda.classe.Habitation;

public class Main {
    public static void main(String[] args) {
        // Instanciations
        Habitation home = new Habitation("Home",3,5);
        Habitation casa = new Habitation("Casa",4,6);
        Habitation haus = new Habitation("Haus",5,7);

        // Appels de méthode
        System.out.println("L’habitation : " + home.getNom() + " à une surface de: " + home.surface() + "m²");
        System.out.println("L’habitation : " + casa.getNom() + " à une surface de: " + casa.surface() + "m²");
        System.out.println("L’habitation : " + haus.getNom() + " à une surface de: " + haus.surface() + "m²");
    }
}
