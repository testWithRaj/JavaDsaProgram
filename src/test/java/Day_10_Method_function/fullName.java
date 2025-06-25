package Day_10_Method_function;

public class fullName {
	
	public void printName(String firstName,String lastname)
	{
		String fulln=firstName+lastname;
		
		System.out.println(fulln);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fullName fl = new fullName();
		fl.printName("Raj", "Kumar");

	}

}
