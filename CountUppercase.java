/**
* @author Victor Bieniek
* CSC 201
* Professor Tanes Kanchanawanchai
* 
* This class reads in a line of text and counts the capital letters in it
*/
import java.util.Scanner;

public class CountUppercase
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input;
		CountUppercase counter = new CountUppercase();
		
		System.out.print("Enter some words and I will count the uppercase letters: ");
		input = scan.nextLine();

		System.out.println("\nNumber of capital letters: " + counter.countCaps(input));
		scan.close();
	}
	
	public int countCaps(String text)
	{
		int asciiCode;
		int numOfCaps = 0;
		
		//loop though each letter
		for(int i = 0; i < text.length(); i++)
		{
			asciiCode = (int)text.charAt(i);
			if(asciiCode < 91 && asciiCode > 64){
				numOfCaps += 1;
			}
		}
		return numOfCaps;
	}
}//end class