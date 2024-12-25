import java.util.Scanner;

public class CompteCourant extends Compte {
    private double fraisBancaires;

    public CompteCourant(int numero, double solde, String proprietaire) {
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
