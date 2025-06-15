package paiements;

public class PaiementDoge implements Paiement {
 
    private double solde;
    

    public PaiementDoge(String wallet, double solde) {
      
        this.solde = solde;
    }

    @Override
    public boolean payer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }

    @Override
    public String getType() {
        return "DogeCoin";
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public int getPriorite() {
        return 3;
    }
}
