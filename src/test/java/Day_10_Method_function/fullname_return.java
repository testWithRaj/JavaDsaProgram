package Day_10_Method_function;

public class fullname_return {
	
	public String fullname(String a, String b)
	{
		String fname=a+ " " +b;
		return fname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fullname_return fn= new fullname_return();
	String result=	fn.fullname("Aarti", "Raj");
	System.out.println(result);

	}

}
