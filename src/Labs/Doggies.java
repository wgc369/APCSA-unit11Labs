package Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
            pups[spot]= new Dog(age, name);
	}

	public String getNameOfOldest()
	{
            String name = "";
            int max = pups[0].getAge();
            for(int i=1; i<pups.length; i++)
            {
                if(pups[i].getAge()>max)
                {
                    max = pups[i].getAge();
                    name = pups[i].getName();
                }
            }
		return name;
	}

	public String getNameOfYoungest()
	{
            String name = "";
            int min = pups[0].getAge();
            for(int i=1; i<pups.length; i++)
            {
                if(pups[i].getAge()<min)
                {
                    min = pups[i].getAge();
                    name = pups[i].getName();
                }
            }
		return name;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}