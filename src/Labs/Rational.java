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
            setRational(0,0);
        }
        public Rational(int n, int d)
        {
            setRational(n, d);
        }
	//write a setRational method
	public void setRational(int n, int d)
        {
            setNum(n);
            setDen(n);
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
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum()
        {
            
        }
        public int getDen()
        {
            
        }
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}