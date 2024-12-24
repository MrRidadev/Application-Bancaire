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
            switch (choix){
                case 1://Gérer Clients
                    GereClient(choix);
                    break;
                case 2://Gérer Comptes
                    break;
                case 3://Gérer Operations
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

    static void GereClient(int choixOption){
        System.out.println("Gere Client");
        switch (choixOption){
            case 1:// Ajouter Client
                break;
            case 2:// Affichier Client
                break;
        }



    }


}
