package Demo;

import java.util.Set;
import java.util.TreeSet;

public class testEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee> set=new TreeSet(new EmployeeComparator());
		set.add(new Employee(300,"Obama"));
		set.add(new Employee(200,"Tom"));
		set.add(new Employee(400,"Bharath"));
		set.add(new Employee(50,"modi"));
		for (Employee employee : set) {
			System.out.println(employee.id);
			System.out.println(employee.Ename);
		}
		
	}

}
