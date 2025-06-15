package paiements;

public interface Paiement {
    boolean payer(double montant);
    double getSolde();
    String getType();
    int getPriorite(); // systèmle de priorité de paiemtn"
}

