import java.util.Scanner;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String numero;

    public Client(int id, String nom, String prenom, String email, String adresse, String numero) {
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

    public String getNumero() {
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
        System.out.println("--- Menu Client ---");
        System.out.println("1. Ajouter un client");
        System.out.println("2. Afficher un client");
        System.out.println("3. Quitter");

        Scanner scannere = new Scanner(System.in);
        int choix = scannere.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Ajouter un client");

                break;
            case 2:
                System.out.println("Afficher un client");

                break;
            case 3:
                System.out.println("Retour au menu principal...");
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                MenuClient();
                break;
        }
        scannere.close();
    }
}