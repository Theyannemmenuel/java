package paiements;
import java.util.ArrayList;
import java.util.List;

public class GestionnairePaiement {
    private List<Paiement> methodes;

    public GestionnairePaiement() {
        this.methodes = new ArrayList<>();
    }

    public void ajouterMethode(Paiement methode) {
        methodes.add(methode);
    }
    public boolean effectuerPaiement(double montant) {
        // On trie la liste par ordre de priorité croissante
        methodes.sort((p1, p2) -> Integer.compare(p1.getPriorite(), p2.getPriorite()));
    
        for (Paiement p : methodes) {
            if (p.payer(montant)) {
                System.out.println("Paiement effectué via " + p.getType());
                return true;
            }
        }
        System.out.println("Échec du paiement : fonds insuffisants.");
        return false;
    }
    
}
