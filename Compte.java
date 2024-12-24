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
}
