package Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
            
            Scanner keyboard = new Scanner(System.in);
            String input = "";
            String decide = "";
            do
            {
            
            System.out.print("Enter a word :: ");
            input = keyboard.nextLine();
            TriangleWord t = new TriangleWord();
            t.printTriangle(input);
            System.out.println("Do you want to enter more sample input? ");
            decide = keyboard.nextLine();
            }while(decide.equals("y"));
	}
}