import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private int numero;
    public static ArrayList<Client> clients = new ArrayList<>();

    public Client(int id, String nom, String prenom, String email, String adresse, int numero) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
    static void MenuClient() {
        int choix;
        do{
        System.out.println("--- Menu Client ---");
        System.out.println("1. Ajouter un client");
        System.out.println("2. Afficher un client");
        System.out.println("3. Quitter");

        Scanner scannere = new Scanner(System.in);
        System.out.print("Vous avez choisi : ");
        choix = scannere.nextInt();
        scannere.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Ajouter un client");
                    AjouterClient();
                    break;
                case 2:
                    System.out.println("Afficher un client");
                    AfficherClient();
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

                    break;
            }
        }while (choix!=3);

    }

    public static boolean ValidationEmail(String email){
        String rejex ="([\\w_-]{1,30}@\\w{1,10}\\.\\w{1,3})$";
        Pattern pattern = Pattern.compile(rejex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static void AjouterClient(){
        int id = clients.size()+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nom de client : ");
        String nom = scanner.nextLine();
        System.out.println("Enter prenom de client : ");
        String prenom= scanner.nextLine();
        boolean valide;
        String email;
        do{
        System.out.println("Enter email(@gmail.com) de client : ");
        email = scanner.nextLine();
        valide = ValidationEmail(email);
        if (!valide){
            System.out.println("structure email invalide!!");
        }}while (!valide);
        System.out.println("Enter numero de client : ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Address de client : ");
        String adresse  = scanner.nextLine();
        Client cl = new Client(id,nom,prenom,email,adresse,numero);
        clients.add(cl);
        System.out.println("Client ajouté avec succès !");

    }
    static void AfficherClient(){
        if (clients.isEmpty()){
            System.out.println("Aucun Client Ajouter D'abord !");
        }
        else {
            System.out.println("Liste des clients : ");
            for (Client client : clients) {
                System.out.println(client);
            }
        }



    }
}