public class Fraction {

    private int n, d;

    public Fraction() {

        this.n = 1;
        this.d = 1;
    }
    public Fraction(int n, int d){


        if (d == 0){
            System.out.println("Error: Denominator zero exception");
            this.n = 1;
            this.d = 1;
        }else {
            this.n = n;
            this.d = d;
        }
    }
    public Fraction(String x){

        int z;

        int s = x.indexOf("/");
        String num = x.substring(0,s);
        String den = x.substring(s+1,x.length());
        z = Integer.parseInt(den);

        if (z == 0){
            this.n = 1;
            this.d = 1;
            System.out.println("Error: Denominator zero exception");
        }else {
            this.n = Integer.parseInt(num);
            this.d = Integer.parseInt(den);
        }
    }
    public Fraction(Fraction x){
        if (x.d == 0){
            this.n = 1;
            this.d = 1;
            System.out.println("Error: Denominator zero exception");
        }else {
            this.n = x.n;
            this.d = x.d;
        }
    }

    public int getNum(){

        return this.n;
    }
    public int getDen(){
        return this.d;
    }
    public double toDouble(){
        if (this.d != 0) {
            double x = ((double) (this.n) / (double) this.d);
            return x;
        }else return 0.0;
    }
    public String toString(){
        if (this.d != 0) {
            return this.n + "/" + this.d;
        }else return "Error: Denominator zero exception";
    }

    public static int GCF(int x, int y){

        while (x != y){
            if (x > y){
                x = x - y;
            }else if (y > x){
                y = y - x;
            }
        }int GCF = x;
        return GCF;
    }



    public void reduce(){
        int gcf = GCF(this.n , this.d);
        this.n = this.n / gcf;
        this.d = this.d / gcf;

    }

    public void setNum(int x){
        this.n = x;
    }
    public void setDen(int x){
        this.d = x;
    }

    public static Fraction multiply(Fraction x, Fraction y){
        int xn = x.n;
        int xd = x.d;
        int yn = y.n;
        int yd = y.d;

        int n = xn * yn;
        int d = yn * yd;
        Fraction ans = new Fraction(n, d);
        return ans;
    }
    public static Fraction divide(Fraction x, Fraction y){
        int xn = x.n;
        int xd = x.d;
        int yn = y.d;
        int yd = y.n;

        int n = xn * yn;
        int d = xd * yd;
        Fraction ans = new Fraction(n , d);
        return ans;
    }
    public static Fraction add(Fraction x, Fraction y){

        int n = x.n * y.d + y.n * x.d;
        int d = y.d * x.d;
        Fraction sum = new Fraction(n , d);
        return sum;
    }
    public static Fraction subtract(Fraction x, Fraction y){

        int n = x.n * y.d - y.n * x.d;
        int d = y.d * x.d;
        Fraction sum = new Fraction(n , d);
        return sum;
    }


}
