package paiements;
public class PaiementPayPal implements Paiement {
    private double solde;

    public PaiementPayPal(String email, double solde) {
       
        this.solde = solde;
    }

    @Override
    public boolean payer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public String getType() {
        return "PayPal";
    }
}
