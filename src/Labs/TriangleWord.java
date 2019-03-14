package Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
            for(int i=0; i<word.length(); i++)
            {
                for(int x=0; x<count; x++)
                {
                    for(int j=0; j<=i; j++)
                    {
                        System.out.print(word.charAt(j));
                    }
                }
                
                System.out.println("");
            }
	}
}