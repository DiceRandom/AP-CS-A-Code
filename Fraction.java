public class Fraction
{
    /* 
    
        Create two varibles to store num and dom
    
        both must be greater than zero
    
        Your Fraction class will also keep track of the number of Fraction objects created by a program. 

        Create appropriate variables to store the information in these fields, all of which should be private.

    */


    private int numerator;
    private int denominator;

    private static int count;


    public Fraction(){
        // default constructor which creates a fraction 1/1

    	numerator = 1;
    	denominator = 1;

        count++;
    }

    public Fraction(int n, int d){
        /*  If n is positive, set numerator to n. Otherwise, set numerator to 1. If d is positive, 
        set denominator to d. Otherwise, set denominator to 1. */

        this();

        if(n > 0){
            numerator = n;
        }else{
            numerator = 1;
        }

        if(d > 0){
            denominator = d;
        }else{
            denominator = 1;
        }
    }



    public int getNumerator(){ 
        // Returns the numerator of the fraction.
        if(numerator < 0){numerator = 1;}

        return numerator;

    }
    public int getDenominator(){ 
        // Returns the denominator of the fraction.

        if(denominator < 0){denominator = 1;}

        return denominator;

    }
    public static int getNumFractions(){ 
        // Returns the number of fractions created in a program so far.

        return count;
    }
    public String toString(){ 
        // Returns the fraction as a string in the format “numerator/denominator”. For example 1/2 or 5/3.

        return (Integer.toString(numerator)+"/"+Integer.toString(denominator));

    }
    public String mixedNumber(){ 
        /* Returns any improper (top-heavy) fraction as a mixed number, for example, 2 3/5. 
        If the numerator of the fraction part is 0, return only the integer part of the mixed number.
        If the fraction is proper, return only the fraction part. */

        // damn ok how..

        // nvm

        if (numerator/denominator<1) {
            return toString();
        }else if(numerator%denominator == 0){
            return "" + numerator/denominator;
        }else{
            return numerator / denominator + " " + numerator % denominator + "/" + denominator;
        }

    }


    void setNumerator(int n){
        //  Sets the numerator of the fraction to n if it is positive.
        if(n > 0){
            numerator = n;
        }
    }
    void setDenominator(int d){
        //  Sets the denominator of the fraction to d if it is positive.
        if(d > 0){
            denominator = d;
        }
    }
    void add(int n, int d){
        /*If n and d are both positive, add the fraction n/d to this fraction. 
        Otherwise, leave the fraction unchanged. In general the sum of the fractions a/b and c/d is(a*d + c*b)/(b*d).*/

        if(n > 0 && d > 0) {
            numerator = (numerator*d + denominator*n);
            denominator = denominator*d;
        }
    }
    void add(Fraction other){
         /*Add the fraction represented by other to this fraction.
        In general the sum of the fractions a/b and c/d is(a*d + c*b)/(b*d). 
        Postcondition{ the other Fraction is left unchanged.*/

        add(other.getNumerator(), other.getDenominator());
    }
    void multiply(int n, int d){
        /*If n and d are both positive, multiply the fraction n/d by this fraction. 
        Otherwise, leave the fraction unchanged. 
        Unsimplified is ok in this case, the formula for multiplying fractions a/b and c/d is (a * c)/(b*d).*/

        if(n > 0 && d > 0) {
            numerator = numerator * n;
            denominator = denominator * d; 
        }
    }
    
    void multiply(Fraction other){
        /* Set this fraction to the product of this fraction and other. 
        Unsimplified is ok in this case, the formula for multiplying fractions a/b and c/d is (a * c)/(b*d).
        Postcondition{ the other Fraction is left unchanged.*/

        numerator = numerator * other.getNumerator();
        denominator = denominator * other.getDenominator();
    }

}
