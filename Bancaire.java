import java.util.Scanner;

public class Bancaire {

    static void MenuPrincipal(){
        System.out.println("===== Menu Principal =====");
        System.out.println("1.Gérer Clients");
        System.out.println("2.Gérer Comptes");
        System.out.println("3.Gérer Operations");
        System.out.println("4.Filtrage");
        System.out.println("5.Quitter");

    }

    public static void main(String[] args) {

        int choix;
        Scanner scannere = new Scanner(System.in);

        do {
            MenuPrincipal();
            System.out.print("Bienvenue dans le Bancaire Entrer votre choix :");
             choix = scannere.nextInt();
            scannere.nextLine();
            switch (choix){
                case 1://Gérer Clients
                    Client.MenuClient();
                    break;
                case 2://Gérer Comptes
                    Compte.MenuCompte();
                    break;
                case 3://Gérer Operations
                    Compte.MenuOperateur();
                    break;
                case 4://Filtrage
                    break;
                case 5:// Quitter
                    break;
                default:
                    System.out.println("Choix incorrect");
            }

        }while (choix != 5);

    }




}
