import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {
    private double tauxInteret;
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<CompteEpargne> compteEpargness = new ArrayList<>();

    public CompteEpargne(int numero, double solde,Client proprietaireN ) {
        super(numero, solde,  proprietaireN);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxInteret=" + tauxInteret +
                '}';
    }

    public static void GestionCompteEpargne(){
        System.out.println("------ Ajouter Compte Epargne -------");
        System.out.println("1-Ajouter Compte Epargne");
        System.out.println("2-Afficher Compte Epargne");
        int choix  = scanner.nextInt();
        switch (choix){
            case 1:
              AjouterCompteEpargne();
                break;
            case 2:
              AfficherCompteEpargne();  
                break;
            default:
                System.out.println("Choix invalide !!!");

        }
    }
    static void AjouterCompteEpargne(){

            System.out.println("Enter numero de compte : ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter solde de compte : ");
            double solde = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter numero de proprietaire  : ");
            int proprietaireN = scanner.nextInt();
            scanner.nextLine();
            Client client = rechercherClient(proprietaireN);
            if(client==null){
                System.out.println("Client ne pas existe ! ");
                return;
            }

        CompteEpargne compteEpargne = new CompteEpargne(numero,solde,client);
        compteEpargness.add(compteEpargne);


        System.out.println("Compte ajouté avec succès !");

    }

    static Client rechercherClient(int numero){
        for (Client client : Client.clients){
            if(client.getNumero()==numero){
                return client;
            }
        }
        return null;

    }
    static void AfficherCompteEpargne() {
        if (compteEpargness.isEmpty()) {
            System.out.println("Aucun Compte Ajouté !");
        } else {
            System.out.println("Liste des comptes : ");
            for (CompteEpargne compteEpargne : compteEpargness) {
                System.out.println(compteEpargne);
            }
        }
    }
}
