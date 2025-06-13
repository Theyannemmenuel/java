public class CarteSpecial extends Carte {
    private final String effet;

    public CarteSpecial(String nom, String effet) {
        super(nom, 0);
        this.effet = effet;
    }

    @Override
    public void jouer() {
        System.out.println("J'active l'effet : " + effet);
    }
        // Dans CarteSpecial.java
    @Override
    public String toString() {
        return nom + " (effet : " + effet + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CarteSpecial autre = (CarteSpecial) obj;
        return nom.equals(autre.nom) && effet.equals(autre.effet);
    }

}
