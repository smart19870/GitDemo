package CustomException;

public class Test {

	public static void main(String[] args) throws CheckedException {
		// TODO Auto-generated method stub
		//throw new UncheckedCustomException("Business exception Occured");
		throw new CheckedException("Business exception occured that needs to be handled");
	}

}
