public class CarteChiffre extends Carte {
    private final String couleur;

    public CarteChiffre(String couleur, int valeur) {
        super(valeur + " de " + couleur, valeur);
        this.couleur = couleur;
    }

    @Override
    public void jouer() {
        System.out.println("Je joue le " + nom);
    }
        // Dans CarteChiffre.java
    @Override
    public String toString() {
        return valeur + " de " + couleur + " (valeur " + valeur + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CarteChiffre autre = (CarteChiffre) obj;
        return valeur == autre.valeur && couleur.equals(autre.couleur);
}

}
