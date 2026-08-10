package OOPSinJAVA;

public class fraction {// class
  public static class Fraction { // class
    int num;
    int den;

    public Fraction(int num, int den) { // constructor
      this.num = num;
      this.den = den;
      simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2) {// methods
      int numerator = f1.num * f2.den + f2.num * f1.den;
      int denominator = f1.den * f2.den;
      Fraction f3 = new Fraction(numerator, denominator);
      return f3;
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {// methods
      int numerator = f1.num * f2.num;
      int denominator = f1.den * f2.den;
      Fraction f4 = new Fraction(numerator, denominator);
      return f4;
    }

    public static Fraction minus(Fraction f1, Fraction f2) {// methods
      int numerator = f1.num * f2.den - f2.num * f1.den;
      int denominator = f1.den * f2.den;
      Fraction f5 = new Fraction(numerator, denominator);
      return f5;
    }

    public static int gcd(int num, int den) {
      int min = Math.min(num, den);
      for (int i = min; i > 1; i--) {
        if (num % i == 0 && den % i == 0) {
          return i;
        }
      }
      return min;
    }

    public void simplify() {// constructor
      int hcf = gcd(num, den);
      num /= hcf;
      den /= hcf;
    }
  }

  public static void main(String[] args) {
    Fraction f1 = new Fraction(12, 4);// Objects
    System.out.println(f1.num + "/" + f1.den);
    Fraction f2 = new Fraction(3, 21);// Objects
    System.out.println(f2.num + "/" + f2.den);

    // addition
    Fraction f3 = Fraction.add(f1, f2);// Objects
    System.out.println(f3.num + "/" + f3.den);

    // multiplication
    Fraction f4 = Fraction.multiply(f1, f2);// Objects
    System.out.println(f4.num + "/" + f4.den);

    // subtraction
    Fraction f5 = Fraction.minus(f1, f2);// Objects
    System.out.println(f5.num + "/" + f5.den);

  }
}

/*
 * Summary of terminology used in your code:
 * OOP Concept Location in Code
 * Class public static class Fraction { ... }
 * Object f1, f2, f3 etc. created in main.
 * Constructor public Fraction(int num, int den) { ... }
 * Methods add, multiply, gcd, simplify.
 * Fields/Attributes int num; and int den;
 */
