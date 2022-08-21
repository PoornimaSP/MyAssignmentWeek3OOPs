package collectionprograms;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
public static void main(String[] args) {		
		
//		Declare a String as PayPal India
	String text="PayPal";

//		Convert it into a character array
	char[] c=new char[text.length()];
	for(int i=0;i<text.length();i++)
	{
		c[i]= text.charAt(i);
	}

//		Declare a Set as charSet for Character
	Set<Character> charSet=new TreeSet<Character>();

//		Declare a Set as dupCharSet for duplicate Character
	Set<Character> dupCharSet=new TreeSet<Character>();

//		Iterate character array and add it into charSet
	for(int i=0; i<c.length;i++)
	{
//		if the character is already in the charSet then, add it to the dupCharSet
		if(charSet.contains(c[i]))
			dupCharSet.add(c[i]);
		else
			charSet.add(c[i]);
			
	}
	System.out.println("Initial Set values");
	System.out.println("-------------------");
	System.out.println("Char set Elements "+charSet );
	System.out.println("Dupchar set Elements "+dupCharSet );
	System.out.println(" ");

//		Check the dupCharSet elements and remove those in the charSet
	
		for(char each:dupCharSet)
		{
			if (charSet.contains(each))
				charSet.remove(each);
		}

//		Iterate using charSet
		for(char each:charSet)
		{
//			Check the iterator variable isn't equals to an empty space
	if(each==' ')
		System.out.println("Char set has empty space ");
		}
		


//		print it
		System.out.println("Set values post removing values of List Dupchar from Char");
		System.out.println("-------------------");
		System.out.println("Char set Elements "+charSet );
		System.out.println("Dupchar set Elements "+dupCharSet );
		System.out.println(" ");

}}
