package Demo;

public class Employee implements Comparable<Employee> {
	
	int id;
	String Ename;
	
	Employee (int id,String Ename){
		this.id=id;
		this.Ename=Ename;
	}

	@Override
	public int compareTo(Employee o2) {
		// TODO Auto-generated method stub
		int id1=this.id;
		int id2=o2.id;
		if (id1>id2) {
			return 1;
		}else if(id2>id1) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	

}
