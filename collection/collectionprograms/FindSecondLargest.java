package collectionprograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		

	
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};
	

	//Create a empty Set Using TreeSet
	
	Set<Integer> sl=new TreeSet<Integer>();
	
	// Declare for loop iterator from 0 to data.length and add into Set 
	for(int i=0;i <data.length;i++) 
	{
		sl.add(data[i]);
	}
	
	System.out.println("The TreeSet :"+ sl);
		
	//converted Set into List
	List<Integer> list = new ArrayList<Integer>(sl);
	

	
	// Print the second last element from List
	System.out.println(	"The second largest number is "+list.get((list.size())-2));

}
}