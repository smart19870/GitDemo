package inheritanceImp;

public class Parent {
	Parent(){
		System.out.println("In Parent");
	}
	Parent(int x){
		this();
		System.out.println("Constructor called in parent with args");
	}
	
	

}
