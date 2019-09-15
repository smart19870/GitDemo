package Demo;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,8,98,78};
		System.out.println("Before Sorting:-");
		for (int eachelement : a) {
			System.out.println(eachelement);
		}
		Arrays.sort(a);
		System.out.println("After sorting:-");
		for (int i : a) {
			System.out.println(i);
		}
		
		String[] str= {"V","Z","P","Y"};
		System.out.println("Before sorting:-");
		for (String string : str) {
			System.out.println(string);
		}
		
		Arrays.sort(str,new ComparatorImp());
		System.out.println("After Sorting");
		for (String string : str) {
			System.out.println(string);
		}
		
		int result = Arrays.binarySearch(a, 98);
		System.out.println("Index is:-"+result);
		
	}

}
