package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollecionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");
		
		System.out.println("Before sorung:-"+l);
		
		Collections.sort(l);
		
		System.out.println("After Sorting:-"+l);
		int result = Collections.binarySearch(l, "X");
		System.out.println("Index is:-"+result);

	}

}
