public class Rational {
    private int num;
    private int den;

    Rational(){     // Constructor without arguments
        num = 1;
        den = 1;
    }

    Rational(int x, int y){     // Constructor with arguments
        this.num = GCD(x, y).num;
        this.den = GCD(x,y).den;
    }



    private Rational GCD(int x, int y){
        int diviser = findingGCD(x, y);

        Rational returnNum = new Rational();
        returnNum.num = ( x/diviser );
        returnNum.den = ( y/diviser );
        return returnNum;
    }

    private int findingGCD(int a, int b){     // Greater Common Diviser
        // Zero Case
        if ( a == 0 || b == 0 )
            return 0;
        // Base Case
        if ( a == b )
            return a;
        // Final Case
        if ( a > b )
            return findingGCD(a-b, b); // Recursive Call
        return findingGCD(a, b-a);  // Recursive Call
    }

    public void displayRational(){
        System.out.println("The answer is: " +this.num +" / " +this.den);
    }

    public Rational addRationals(Rational newNum){
        int finalDen = ( this.den * newNum.den );
        int finalNum = (  (this.num*newNum.den) + (newNum.num*this.den) );
        return new Rational(finalNum, finalDen);
    }

    public Rational subtractRationals(Rational newNum){
        int finalDen = ( this.den * newNum.den );
        int finalNum = ( (this.num * newNum.den) - (newNum.num * this.den) );
        return new Rational(finalNum, finalDen);
    }

    public Rational multiplyRationals(Rational newNum){
        int finalNum = ( this.num * newNum.num );
        int finalDen = ( this.den * newNum.den );
        return new Rational(finalNum, finalDen);
    }

    public Rational divideRationals(Rational newNum){
        int finalNum = ( this.num * newNum.den );
        int finalDen = ( this.den * newNum.num );
        return new Rational(finalNum, finalDen);
    }

}
