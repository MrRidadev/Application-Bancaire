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
        return "CompteCourant{" +
                "fraisBancaires=" + fraisBancaires +
                '}';
    }

}
