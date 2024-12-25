import java.util.Scanner;

abstract class Compte {
    private int numero;
    private double solde;
    private String proprietaire;

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
                    break;
                case 2:
                    System.out.println("Afficher un compte");
                    break;
                case 3:
                    System.out.println("Associer un compte");
                    break;
                case 4:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while (choix!=4);
    }
}
