package Demo;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StringBuffer> set=new TreeSet<>(new SBComparator());
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xxxxxxxyz"));
		set.add(new StringBuffer("cccdef"));
		set.add(new StringBuffer("bbbbbbbbbbbbbbmno"));
		set.add(new StringBuffer("wsd"));
		
		for (StringBuffer str : set) {
			System.out.println(str);
		}
	}

}
