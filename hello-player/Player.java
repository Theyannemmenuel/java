import java.util.Random;

public class Player {
    private final String name;
    private int hp;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
    }

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
        System.out.println(name + " a subi " + amount + " dégâts. HP restants : " + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    // j'ai crée une classe weapon directement dansle meme fichier 
    public static class Weapon {
        private final int minDamage;
        private final int maxDamage;
        private final Random rand = new Random();

        public Weapon(int minDamage, int maxDamage) {
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
        }

        public int rollDamage() {
            return rand.nextInt(maxDamage - minDamage + 1) + minDamage;
        }
    }

    public static void main(String[] args) {
        Player yann = new Player("Yann");
        Weapon sword = new Weapon(10, 25);

        yann.greet();

        int damage = sword.rollDamage();
        System.out.println("L'arme inflige " + damage + " dégâts.");
        yann.takeDamage(damage);

        if (yann.isAlive()) {
            System.out.println(yann.name + " est encore en vie avec " + yann.getHp() + " HP !");
        } else {
            System.out.println(yann.name + " est KO !");
        }
    }
}
