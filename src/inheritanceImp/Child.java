package inheritanceImp;

public class Child extends Parent {
	Child(){
		this(10);
		System.out.println("In child");
	}
	Child(int x){
		super(x);
		System.out.println("Child constructor called with args");
	}
}
