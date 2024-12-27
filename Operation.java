public class Operation {
    private double montant;
    private String type;
    private Compte compte;
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

    
}
