package ImmuatableClass;

public class TestImmutability {
	public static void main(String[] args) {
		
		Address address = new Address();
		
		address.setCity("Pune");
		address.setCountry("India");
		address.setPin(416010);
		
		ImmutableEmployee emp1 = new ImmutableEmployee(123,"Rohit",address);
		
		System.out.println("emp1 befor modification "+emp1);
		
		emp1.getAddress().setCity("Kolhapur");
		
		emp1.getAddress().setPin(416010);
		
		emp1.getAddress().setCountry("ABCD");
		
		System.out.println("emp1 after modification "+emp1);
		
		
	}

}
