import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    private double montant;
    private String type;
    private Compte compte;
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Operation> operations = new ArrayList<>();

    public Operation(double montant, String type, Compte compte) {
        this.montant = montant;
        this.type = type;
        this.compte = compte;
    }

    public double getMontant() {
        return montant;
    }

    public String getType() {
        return type;
    }

    public Compte getCompte() {
        return compte;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "montant=" + montant +
                ", type='" + type + '\'' +
                ", compte=" + compte +
                '}';
    }

    public static void effectuerDepot() {
        System.out.println("---------- Effectuer Dépôt ---------");
        System.out.print("Type : ");
        String type = scanner.next();
        System.out.print("Montant : ");
        double montant = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Date : ");
        String date = scanner.nextLine(); // Date input not used in constructor
        System.out.println("--------- Compte ---------- ");
        System.out.println("1 - Compte Courant");
        System.out.println("2 - Compte Épargne");
        System.out.print("Saisissez votre choix : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.print("Entrez le numéro de compte : ");
                int numeroCompte = scanner.nextInt();
                CompteCourant compteCourant = rechercherCompteCourant(numeroCompte);
                if (compteCourant != null) {
                    Operation operation = new Operation(montant, type, compteCourant);
                    operations.add(operation);
                    System.out.println("Dépôt effectué avec succès.");
                } else {
                    System.out.println("Compte courant introuvable.");
                }
                break;
            case 2:
                // Logic for Compte Épargne can be added here
                System.out.println("Fonctionnalité pour Compte Épargne à implémenter.");
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }

    public static CompteCourant rechercherCompteCourant(int numero) {
        for (CompteCourant compteCourant : CompteCourant.compteCourants) {
            if (compteCourant.getNumero() == numero) {
                return compteCourant;
            }
        }
        return null;
    }

    static void MenuOperateur() {
        int choix;
        do {
            System.out.println("--- Menu Opérateur ---");
            System.out.println("1. Déposer");
            System.out.println("2. Retirer");
            System.out.println("3. Virement");
            System.out.println("4. Afficher l'historique");
            System.out.println("5. Quitter");

            System.out.print("Vous avez choisi : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1: // Déposer
                    effectuerDepot();
                    break;
                case 2: // Retirer
                    System.out.println("Retirer de l'argent.");
                    // Logic for withdrawal can be implemented here
                    break;
                case 3: // Virement
                    System.out.println("Effectuer un virement.");
                    // Logic for transfer can be implemented here
                    break;
                case 4: // Afficher l'historique
                    System.out.println("Historique des opérations :");
                    for (Operation operation : operations) {
                        System.out.println(operation);
                    }
                    break;
                case 5: // Quitter
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 5);
    }


}
