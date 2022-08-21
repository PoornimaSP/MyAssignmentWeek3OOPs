package collectionprograms;

import java.util.ArrayList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FindIntersection {
	public static void main(String[] args) {
		
//Declare An Array for {3,2,11,4,6,7};	
		int[] a={3,2,11,4,6,7};
// Declare another Array for {1,2,8,4,9,7};
	 int[] b={1,2,8,4,9,7};
	 
 
//Create a two empty Lists - list1 & list2
	 
	 List<Integer> list1= new ArrayList<Integer>();
	 
	 List<Integer> list2= new ArrayList<Integer>();
	 
// Declare for loop iterator from 0 to array a.length and add into list1
// Declare for loop iterator from 0 to array b.length and add into another list2
	 
	 for(int i=0;i<a.length;i++)
	 { list1.add(a[i]);
     }

	 for(int j=0;j<b.length;j++)
	 { list2.add(b[j]);			 
	 }

	//Compare Both list1 & list2 using a nested for loop
	 System.out.println("Intesection of array a and b using list is");
for(int i=0;i<list1.size();i++)
{
	for(int j=0;j<list2.size();j++)
	{
		if(list1.get(i)==list2.get(j))
			//Print the matching number
			 System.out.println(list1.get(i));
	
	}
}
	 
	 
	}

}

