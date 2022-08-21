package collectionprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[] data= {4,6,3,1,7,9,7,1,2,5,10};
	

		
		// Remove the duplicates using Set
		// Make sure the set is in the ascending order
		  Set<Integer> mn=new TreeSet<Integer>();
		  for(int i=0 ;i<data.length;i++)
			{
				mn.add(data[i]);
			}
		  System.out.println("Set elements :" + mn);
	List<Integer> list= new ArrayList<Integer>(mn);
	System.out.println("List elements "+list);
		 
		// Iterate from the starting number and verify the next number is + 1
	// If did not match, that is the number

for(int i=0;i<data.length;i++)
{
	
		if ( ((list.get(i))+1)!= list.get(i+1))
{
	  System.out.println("The missing number in the List is "+(list.get(i)+1));
	  break;

	
}}
		

}}
