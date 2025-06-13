package fractions;

public class Fraction {
    private final int num;
    private final int den;

    public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }

        int gcd = pgcd(num, den);
        num /= gcd;
        den /= gcd;

        if (den < 0) {
            num = -num;
            den = -den;
        }

        this.num = num;
        this.den = den;
    }

    private static int pgcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public Fraction add(Fraction other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newDen = this.den * other.den;
        return new Fraction(newNum, newDen);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.num * other.num, this.den * other.den);
    }

    public double toDouble() {
        return (double) num / den;
    }

    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(1, 6);

        System.out.println("f + g = " + f.add(g));
        System.out.println("f * g = " + f.multiply(g));

        assert f.add(g).toString().equals("5/6") : "Addition incorrecte";
        assert f.multiply(g).toString().equals("1/9") : "Multiplication incorrecte";
    }
}
