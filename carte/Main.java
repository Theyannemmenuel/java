public class Main {
    public static void main(String[] args) {
        Carte[] main = new Carte[3];
        main[0] = new CarteChiffre("Cœur", 8);
        main[1] = new CarteSpecial("Joker", "Change la couleur");
        main[2] = new CarteChiffre("Pique", 1);

        for (Carte c : main) {
            c.jouer();
        }
    }
}
