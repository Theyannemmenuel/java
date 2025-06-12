public class Player {
    private final String name;
    private int hp;  // Points de vie

    public Player(String name) {
        this.name = name;
        this.hp = 100; // Initialisation des HP
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
    }

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0; // Pour éviter les HP négatifs
        System.out.println(name + " a subi " + amount + " dégâts. HP restants : " + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public static void main(String[] args) {
        Player yann = new Player("Yann");
    
        yann.takeDamage(10); // Yann subit tous les dégâts d'un coup
    
        // Teste s'il est encore en vie
        if (yann.isAlive()) {
            System.out.println("Yann est encore en vie !");
        } else {
            System.out.println("Yann est KO !");
        }
    
        // Assertion pour les tests automatiques
        assert !yann.isAlive();
    }
    
}
