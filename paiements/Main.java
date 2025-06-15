package paiements;
public class Main {
    public static void main(String[] args) {
        Paiement carte = new PaiementCarte("123456789", 100.0);
        Paiement paypal = new PaiementPayPal("email@example.com", 130.0);
        Paiement doge = new PaiementDoge("DogeWallet123", 200.0);

        GestionnairePaiement gestionnaire = new GestionnairePaiement();
        gestionnaire.ajouterMethode(carte);
        gestionnaire.ajouterMethode(paypal);
        gestionnaire.ajouterMethode(doge);

        gestionnaire.effectuerPaiement(30.0); // devrait passer par la carte
        gestionnaire.effectuerPaiement(80.0); // devrait passer par PayPal
        gestionnaire.effectuerPaiement(150.0); // devrait échouer
    }
}
