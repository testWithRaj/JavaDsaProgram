package Day_10_Method_function;

public class Returnvalue {

	
	public int multi(int a,int b)
	{
		int multiply=a*b;
		return multiply;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returnvalue rv= new Returnvalue();
		int result=rv.multi(10, 5);
		System.out.println(result);

	}

}
