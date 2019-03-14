package Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
        int num, den;
	//write two constructors
        public Rational()
        {
            setRational(1,1);
        }
        public Rational(int n, int d)
        {
            setRational(n, d);
        }
	//write a setRational method
	public void setRational(int n, int d)
        {
            setNum(n);
            setDen(d);
        }

	//write  a set method for numerator and denominator
        public void setNum(int n)
        {
            num = n;
        }
	public void setDen(int d)
        {
            den = d;
        }
        
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)

            int num = (getNum() * other.getDen()) + (getDen() * other.getNum());
            int den = (getDen() * other.getDen());

            setNum(num);
            setDen(den);

            reduce();

	}

	private void reduce()
	{
            int GCD = gcd(num, den);

            setNum(getNum() / GCD);
            setDen(getDen() / GCD);

	}

	private int gcd(int numOne, int numTwo)
	{
            int min = Math.min(numOne, numTwo);
            for(int x=min; x>1; x--)
            {
                if(numOne%x==0 && numTwo%x==0)
                    return x;
            }

		return 1;
	}

	public Object clone ()
	{
		return new Rational(getNum(), getDen());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum()
        {
            return num;
        }
        public int getDen()
        {
            return den;
        }
	
	public boolean equals( Object obj)
	{

            int objNum = ((Rational)obj).getNum();
            int objDen = ((Rational)obj).getDen();
            int g = gcd(objNum, objDen);
            objNum = objNum/g;
            objDen = objDen/g;
            return ( num == objNum && den == objDen );

		//return false;
	}

	public int compareTo(Rational other)
	{
            reduce();
            other.reduce();

            if ( this.getDen() < other.getDen() ) 
            {
                return -1;
            }
            else if ( this.getDen() == other.getDen() ) 
            {
                if( this.getNum() < other.getNum() ) 
                {
                    return -1;
                }
                else if( this.getNum() > other.getNum() ) 
                {
                    return 1;
                }
                else{
                    return 0;
                }
            }
		return -1;
	}

        public String toString() 
        {
            return num + "/" + den + "\n";
        }

	
	//write  toString() method
	
	
}