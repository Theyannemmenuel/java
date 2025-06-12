package mathutils;

public class MathUtils {

    
    public static int pgcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static void main(String[] args) {
        int result = pgcd(42, 30);
        System.out.println("le PGCD de 42 et 30 = " + result); 

        
        assert result == 6 : "Erreur : le PGCD devrait être 6";
    }
}
