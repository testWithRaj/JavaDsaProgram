package Day_10_Method_function;

public class MethodsWithParameter {

	public void printSum(int a,int b)
	{
		int sum=a+b;
		
		System.out.println("sum of two digits are: "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsWithParameter mp=new MethodsWithParameter();
		mp.printSum(10, 20);
		

	}

}
