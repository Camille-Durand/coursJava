import java.util.Scanner;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Test
        //System.out.println("Howdy\n*****************");
        //System.out.println("Addition: " + addition(5,12));

        // 1
        //System.out.println("soustraction: " + soustraction(25,4,9));

        // 2
        //System.out.println("Moyenne: " + moyenne(47,32,5,12));

        // 3
        //System.out.println("Intervertir: " + intervertir(12,65));

        // 4
        //carre();

        // 5
        //add();

        // 6
        //System.out.println("La moyenne est de " + moyenneUser());

        // 7
        //System.out.println("Le prix TTC est de " + TTC() + "€");

        // 8
        //System.out.println(verif());

        // 9
        //System.out.println(verif2());

        // 10
        //System.out.println(age());

        // 11
        //System.out.println(clock());

        // 12
        //System.out.println(clockPlus());

        // 13
        //System.out.println(photocopie());

        // 14
        //System.out.println(number());

        // 15
        //System.out.println(numberz());

        // 16
        //next();

        // 17
        //multipli();

        // 18
        //System.out.println(somme());

        // 19
        //System.out.println(min());

        // 20
        //System.out.println(max());

        // 21
        //System.out.println(moyenneTab());

        // 22
        //System.out.println(notes());

        // 23
        //quelconque();

        // 24
        absolue();

    }

    // Test
    public static int addition(int nbr1, int nbr2) {
        return nbr1 + nbr2;
    }

    // 1
    public static int soustraction(int i, int j, int k) {
        return (i - j) - k;
    }

    // 2
    public static int moyenne(int i, int j, int k, int l) {
        return (i + j + k + l) / 4;
    }

    // 3
    public static String intervertir(int i, int j){
        int interI = i;     // On stocke i, car sa valeur va être écrasée juste après
        i = j;              // On écrase la valeur de i et la remplace par celle de j
        j = interI;         // On remplace j par l'ancienne valeur de i

        return "i = " + i + " et j = " + j ;
    }

    // 4
    public static void carre(){
        System.out.println("Veuillez saisir un nombre: ");
        Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();

        int carre = nbr * nbr;

        System.out.println("Carré du nombre saisi: " + carre);
    }

    // 5
    public static void add(){
        System.out.println("Veuillez saisir le 1er nombre: ");
        Scanner scanner1 = new Scanner(System.in);
        int nbr1 = scanner1.nextInt();

        System.out.println("Veuillez saisir le 2e nombre: ");
        Scanner scanner2 = new Scanner(System.in);
        int nbr2 = scanner2.nextInt();

        int add = nbr1 + nbr2;

        System.out.println("Addition des 2 nombres: " + add);
    }

    // 6
    public static double scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre: ");
        double nbr = scanner.nextDouble();
        return nbr;
    }

    public static String moyenneUser(){
        double nbr1 = scan();
        double nbr2 = scan();
        double nbr3 = scan();

        double result = (nbr1 + nbr2 + nbr3) / 3;

        return String.format("%.2f", result);
    }

    // 7
    public static String TTC(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix HT: ");
        double HT = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Veuillez saisir le nbr d'article: ");
        int article = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Veuillez saisir le taux de TVA: ");
        double TVA = scanner3.nextDouble();

        double TTC = (HT + TVA) * article;

        return String.format("%.2f", TTC);
    }

    // 8
    public static String verif(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le 1er nombre: ");
        int nbr1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Veuillez saisir le 2e nombre: ");
        int nbr2 = scanner2.nextInt();

        if(nbr1 > 0 && nbr2 > 0){
            return "Le produit est positif!";
        } else if (nbr1 < 0 && nbr2 < 0){
            return "Le produit est positif!";
        } else {
            return "Le produit est négatif!";
        }
    }

    // 9
    public static String verif2(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le 1er nombre: ");
        int nbr1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Veuillez saisir le 2e nombre: ");
        int nbr2 = scanner2.nextInt();

        if(nbr1 > 0 && nbr2 > 0){
            return "Le produit est positif!";
        } else if (nbr1 < 0 && nbr2 < 0){
            return "Le produit est positif!";
        } else if (nbr1 == 0 || nbr2 == 0){
            return "Le produit est égal à 0!";
        } else {
            return "Le produit est négatif!";
        }
    }

    // 10
    public static String age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez renseigner votre age: ");
        int age = scanner.nextInt();
        String response = "";

        switch(age){
            case 6:
            case 7:
                response = "Poussin";
                break;
            case 8:
            case 9:
                response = "Pupille";
                break;
            case 10:
            case 11:
                response = "Minime";
                break;
            default:
                if(age >= 12){
                    response = "Cadet";
                } else {
                    response = "NaN";
                }
                break;
        }
        return "Catégorie: " + response;
    }

    // 11
    public static String clock(){ // 11
        Scanner scannerHeure = new Scanner(System.in);
        System.out.println("Veuillez renseigner l'heure: ");
        int heure = scannerHeure.nextInt();

        Scanner scannerMinutes = new Scanner(System.in);
        System.out.println("Veuillez renseigner les minutes: ");
        int minutes = scannerMinutes.nextInt();

        minutes += 1;

        if(minutes >= 60){
            heure += 1;
            minutes = minutes - 60;
        }
        return "Dans 1 minute, il sera " + heure + "H" + minutes;
    }

    // 12
    public static String clockPlus(){ // 12
        Scanner scannerHeure = new Scanner(System.in);
        System.out.println("Veuillez renseigner l'heure: ");
        int heure = scannerHeure.nextInt();

        Scanner scannerMinutes = new Scanner(System.in);
        System.out.println("Veuillez renseigner les minutes: ");
        int minutes = scannerMinutes.nextInt();

        Scanner scannerSecondes = new Scanner(System.in);
        System.out.println("Veuillez renseigner les secondes: ");
        int secondes = scannerSecondes.nextInt();

        secondes += 1;

        if(secondes >= 60){
            minutes += 1;
            secondes = secondes - 60;
        }

        if(minutes >= 60){
            heure += 1;
            minutes = minutes - 60;
        }

        if(heure >= 24){
            heure = heure - 24;
        }

        return "Dans 1 minute, il sera " + heure + "H" + minutes + " et " + secondes + "sec";
    }

    // 13
    public static String photocopie(){
        // 0.10€ les 10 premières
        // 0.09€ les 20 suivantes + 1€ de 10 premières
        // 0.08€ le reste + 1.90€ des 20 premières

        Scanner scanner = new Scanner(System.in);
        System.out.println("PoyoCopy\n");
        System.out.println("0.10€ les 10 premières");
        System.out.println("0.09€ les 20 suivantes + 1€ de 10 premières");
        System.out.println("0.08€ le reste + 1.90€ des 20 premières");

        System.out.print("\nVeuillez renseigner le nombre de copies: ");
        int nbrCopies = scanner.nextInt();
        double prix = 0;

        if (nbrCopies > 0 && nbrCopies <= 10){
            prix = nbrCopies * 0.10;
        } else if (nbrCopies > 10 && nbrCopies <= 20){
            prix = ((nbrCopies-10) * 0.09) + 1;
        } else if (nbrCopies > 20){
            prix = ((nbrCopies-20) * 0.08) + 1.9;
        } else {
            return "Valeur invalide";
        }
        return "Le total est de " + prix + "€";
    }

    // 14
    public static String number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez ecrire un chiffre compris entre 1 & 3: ");
        int nbr = scanner.nextInt();

        while(nbr < 1 || nbr > 3){
            System.out.println("Entre 1 & 3 j'ai dit: ");
            nbr = scanner.nextInt();
        }
        return nbr + " -> Yes :)";
    }

    // 15
    public static String numberz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez ecrire un nombre compris entre 10 & 20: ");
        int nbr = scanner.nextInt();

        while(nbr < 10 || nbr > 20){
            if(nbr < 10){
                System.out.print("Plus grand: ");
                nbr = scanner.nextInt();
            } else {
                System.out.print("Plus petit:  ");
                nbr = scanner.nextInt();
            }
        }
        return nbr + " -> Yes :)";
    }

    // 16
    public static void next(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez taper un nombre de départ: ");
        int start = scanner.nextInt();

        ArrayList<Integer> collection = new ArrayList<>();

        for(int i = 0; i < 11; i++){
            collection.add(start + i);
        }

        for(int value: collection){
            System.out.print(value + "/");
        }
    }

    // 17
    public static void multipli(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez taper un nombre de départ: ");
        int start = scanner.nextInt();

        ArrayList<String> table = new ArrayList<>();

        for(int i = 0; i < 11; i++){
            table.add(start + "x" + i + " = " + start*i);
        }

        for(String value: table){
            System.out.println(value);
        }
    }

    // 18
    public static int somme(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez taper un nombre de départ: ");
        int end = scanner.nextInt();

        int nbr = 0;
        int somme = 0;

        for(int i = end; i > -1; i--){
            nbr = end - i;
            somme = somme + nbr;
        }
        return somme;
    }

    // 19
    public static String min(){
        int [] tab = {10,33,56,89,7,11,2,16} ; // Ici c'est 2
        int min = 0;

        for(int i = 0; i < tab.length; i++){
            if(min == 0){
                min = tab[i];
            }
            if(tab[i] <= min){
                min = tab[i];
            }
        }
        return "Le nombre min est: " + min;
    }

    // 20
    public static String max(){
        int [] tab = {10,33,56,89,7,11,2,16} ; // Ici c'est 89
        int max = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] >= max){
                max = tab[i];
            }
        }
        return "Le nombre max est: " + max;
    }

    // 21
    public static String moyenneTab(){
        int [] tab = {10,33,56,89,7,11,2,16} ; // moyenne = (addition all)/ tab.length
        int total = 0;

        for(int i = 0; i < tab.length; i++){
            total = total + tab[i];
        }
        total = total/tab.length;

        return "La moyenne est de: " + total;
    }

    // 22
    public static String notes(){
        ArrayList<Integer> tabNotes = new ArrayList<>();
        int notes = 0;
        int totalNotes = 0;
        int moyenneNotes = 0;

        for(int i = 1; i < 6; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez saisir les notes de l'élève " + i + ": ");
            notes = scanner.nextInt();
            tabNotes.add(notes);
        }

        for(Integer value: tabNotes){
            totalNotes = totalNotes + value;
        }
        moyenneNotes = (totalNotes * tabNotes.size())/20;

        return "La moyenne de la classe est de " + moyenneNotes + "/20";
    }

    // 23
    public static void quelconque(){
        Scanner scannerNbrV = new Scanner(System.in);
        System.out.print("Combien de valeurs souhaitez-vous rentrer? ");
        int nbrValeurs = scannerNbrV.nextInt();

        ArrayList<Integer> tabValeurs = new ArrayList<>();
        int positif = 0;
        int negatif = 0;
        int zero = 0;


        for(int i = 0; i < nbrValeurs; i++){
            Scanner scannerVal = new Scanner(System.in);
            System.out.print("Nouvelle valeur: ");
            int valeurs = scannerVal.nextInt();
            tabValeurs.add(valeurs);
        }

        for(int value: tabValeurs){
            if(value < 0){
                positif++;
            } else if (value > 0){
                negatif++;
            } else {
                zero++;
            }
        }
        System.out.println("Positif: " + positif + "\nNegatif: " + negatif + "\nZero: " + zero);
    }

    // 24
    public static void absolue(){
        int[] tab = {2,18,-5,12,36,-1,14};
        int mini = 0;

        for (int i : tab) {
            if (mini == 0) {
                mini = i;
            }
            if (i <= mini) {
                mini = i;
            }
        }

        System.out.println("La plus petite valeur est: " + mini + "\nSa valeur absolue est: " + -mini);
    }


}
