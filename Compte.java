import java.util.ArrayList;
import java.util.Scanner;

abstract class Compte {
    private int numero;
    private double solde;
    private Client proprietaire;
    private static ArrayList<Compte> Comptes = new ArrayList<>();

    public Compte(int numero, double solde, Client proprietaire) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
    }
    public int getNumero() {
        return numero;
    }
    public double getSolde() {
        return solde;
    }
    public Client getProprietaire() {
        return proprietaire;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }


    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", proprietaire='" + proprietaire + '\'' +
                '}';
    }

    static void MenuCompte(){
        int choix;
        do{
        System.out.println("--- Menu Compte ---");
        System.out.println("1. Compte Courant");
        System.out.println("2. Compte Epargne");
        System.out.println("4. Quitter");
            Scanner scannere = new Scanner(System.in);
            System.out.print("Vous avez choisi : ");
            choix = scannere.nextInt();
            scannere.nextLine();
            switch (choix) {
                case 1:
                    CompteCourant.GestionCompteCourant();
                    break;
                case 2:
                    System.out.println("Afficher un compte");
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while (choix!=4);
    }


    static void MenuOperateur() {
        int choix;
        do {
            System.out.println("--- Menu Operateur ---");
            System.out.println("1. Deposer");
            System.out.println("2. Retirer");
            System.out.println("3. Virement");
            System.out.println("4.Afficher L'historique");
            System.out.println("5. Quitter");

            Scanner scannere = new Scanner(System.in);
            System.out.print("Vous avez choisi : ");
            choix = scannere.nextInt();

            switch (choix) {
                case 1: // Deposer
                    System.out.println("Déposer de l'argent.");
                    break;
                case 2: // Retirer
                    System.out.println("Retirer de l'argent.");
                    break;
                case 3: // Virement
                    System.out.println("Effectuer un virement.");
                    break;
                case 4: // Afficher L'hostorique
                    System.out.println("L'hstorique");
                    break;
                case 5: // Quitter
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 5);
    }

    public void Déposer(double montant){

        if (montant > 0) {
            this.solde += montant;
            System.out.println("Dépôt réussi. Nouveau solde : " + solde);
        } else {
            System.out.println("Montant invalide.");
        }

    }

}
