package Demo;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		
		int l1=s1.length();
		int l2=s2.length();
		if (l1>l2) {
			return 1;
		}else if(l2>l1) {
			return -1;
		}else {
			return s1.compareTo(s2);
		}
		
		
	}

}
