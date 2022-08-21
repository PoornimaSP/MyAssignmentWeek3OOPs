package collectionprograms;

import java.util.HashSet;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="Poornima";
		
		char[] c = new char[name.length()];
		
		//Convert String to Character array
		for(int i=0;i<name.length();i++)
		{
			c[i]=name.charAt(i);
		}
				
		//Create a new Set -> HashSet
		HashSet<Character> nw= new HashSet<Character>();
		// Add each character to the Set and if it is already there, remove it
		for(int i=0;i<name.length();i++)
		{
			if(nw.contains(c[i]))
			{
				nw.remove(c[i]);
			}
			else
				nw.add(c[i]);
		}
		
		System.out.println(nw);
		// Finally, print the set
	}

}
