package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColectionReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(8);
		l.add(80);
		l.add(78);
		
		System.out.println("Before reversing:-"+l);
		
		Collections.reverse(l);
		
		System.out.println("After reversing:-"+l);
	}

}
