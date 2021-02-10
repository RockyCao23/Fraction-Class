import java.sql.SQLOutput;

public class Driver {

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        Fraction f2 = new Fraction("1/0");
        Fraction f3 = new Fraction("1/2");
        Fraction f4 = new Fraction();

        //System.out.println(fraction1.n + "/" + fraction1.d);
        System.out.println(f2.toDouble());
        System.out.println( f3 + " + " + f4 + " = " + Fraction.add(f3, f4) );
        System.out.println(f2.toString());
        System.out.println(f2);
        System.out.println(f2.toDouble());
    }
}
