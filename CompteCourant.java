import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    private double fraisBancaires;
    public static ArrayList<CompteCourant> compteCourants = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public CompteCourant(int numero, double solde, Client proprietaire) {
        super(numero, solde, proprietaire);
        this.fraisBancaires = fraisBancaires;
    }
    public double getFraisBancaires() {
        return fraisBancaires;
    }
    public void setFraisBancaires(double fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }
    @Override
    public String toString() {
        return super.toString() ;
    }
    public static void GestionCompteCourant(){
        System.out.println("------ Ajouter Compte Courant -------");
        System.out.println("1-Ajouter Compte Courant");
        System.out.println("2-Afficher Compte Courant");
        int choix  = scanner.nextInt();
        switch (choix){
            case 1:
                AjouterCompteCourant();
                break;
            case 2:
                AfficherCompteCourant();
                break;
            default:
                System.out.println("Choix invalide !!!");

        }
    }
    static Client rechercherClient(int numero){
        for (Client client : Client.clients){
            if(client.getNumero()==numero){
                return client;
            }
        }
        return null;

    }

    static void AjouterCompteCourant(){
        System.out.println("Enter numero de compte : ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter solde de compte : ");
        double solde = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter numero de proprietaire  : ");
        int proprietaireN = scanner.nextInt();

        Client client = rechercherClient(proprietaireN);
        if(client==null){
            System.out.println("Client ne pas existe ! ");
            return;
        }

        CompteCourant compteCourant = new CompteCourant(numero,solde,client);
        compteCourants.add(compteCourant);
        System.out.println("Compte ajouté avec succès !");
    }
    static void AfficherCompteCourant() {
        if (compteCourants.isEmpty()) {
            System.out.println("Aucun Compte Ajouté !");
        } else {
            System.out.println("Liste des comptes : ");
            for (CompteCourant compteCourant : compteCourants) {
                System.out.println(compteCourant);
            }
        }
    }



    static void MenuFiltrage() {
        int choix;
        do {
            System.out.println("--- Menu Filtrage ---");
            System.out.println("1. Par Transaction");
            System.out.println("2. Par Date");
            System.out.println("3. Par Solde Minimale");
            System.out.println("4. Quitter");

            Scanner scannere = new Scanner(System.in);
            System.out.print("Vous avez choisi : ");
            choix = scannere.nextInt();

            switch (choix) {
                case 1: // filtrage par transaction
                    System.out.println("filtrage par transaction");
                    break;
                case 2: // filtrage par date
                    System.out.println("filtrage par date");
                    break;
                case 3: // filtrage par solde minimale
                    System.out.println("filtrage par solde minimale");
                    break;
                case 4: // Quitter
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 4);
    }

}
