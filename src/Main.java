import com.cda.gameAgain.*;
public class Main {
    public static void main(String[] args) {
        Batman batman = new Batman("Batman",20,15,44);
        Flash flash = new Flash("Flash",24,10,25);
        Superman superman = new Superman("Superman",34,35,5);

        batman.attaquer(superman);
        flash.attaquer(batman);
        superman.attaquer(flash);
    }
}