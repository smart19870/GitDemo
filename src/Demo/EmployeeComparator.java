package Demo;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		String s1=o1.Ename;
		String s2=o2.Ename;
		return s1.compareTo(s2);
	}

}
