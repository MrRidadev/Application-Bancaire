import java.util.ArrayList;
import java.util.Scanner;

abstract class Compte {
    private int numero;
    private double solde;
    private Client proprietaire;
    private static ArrayList<Compte> Comptes = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

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
        System.out.println("3. Quitter");
            Scanner scannere = new Scanner(System.in);
            System.out.print("Vous avez choisi : ");
            choix = scannere.nextInt();
            scannere.nextLine();
            switch (choix) {
                case 1:
                    CompteCourant.GestionCompteCourant();
                    break;
                case 2:
                    CompteEpargne.GestionCompteEpargne();
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while (choix!=3);
    }





    static Client recherCompteCourant(int numero){
        for (Client client : Client.clients){
            if(client.getNumero()==numero){
                return client;
            }
        }
        return null;

    }
}
