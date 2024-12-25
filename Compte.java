import java.util.ArrayList;
import java.util.Scanner;

abstract class Compte {
    private int numero;
    private double solde;
    private String proprietaire;
    private Client client;
    private static ArrayList<Compte> Comptes = new ArrayList<>();

    public Compte(int numero, double solde, String proprietaire) {
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
    public String getProprietaire() {
        return proprietaire;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
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
        System.out.println("1. Ajouter un compte");
        System.out.println("2. Afficher un compte");
        System.out.println("3. Associer un compte");
        System.out.println("4. Quitter");
            Scanner scannere = new Scanner(System.in);
            System.out.print("Vous avez choisi : ");
            choix = scannere.nextInt();
            scannere.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter un compte");
                    AjouterCompte();
                    break;
                case 2:
                    System.out.println("Afficher un compte");
                    AfficherCompte();
                    break;
                case 3:
                    System.out.println("Associer un compte");
                    break;
                case 4:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while (choix!=4);
    }
    static void AjouterCompte(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numero de compte : ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter solde de compte : ");
        double solde = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter proprietaire de compte : ");
        String proprietaire = scanner.nextLine();
        Compte compte = new CompteCourant(numero,solde,proprietaire);
        Comptes.add(compte);
        System.out.println("Compte ajouté avec succès !");
    }
    static void AfficherCompte() {
        if (Comptes.isEmpty()) {
            System.out.println("Aucun Compte Ajouté !");
        } else {
            System.out.println("Liste des comptes : ");
            for (Compte compte : Comptes) {
                System.out.println(compte);
            }
        }
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
