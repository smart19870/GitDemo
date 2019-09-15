package encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient();
		p.setId(20);
		p.setName("TOM");
		p.setSsn("ALGPT7687631L");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSsn());
	}

}
