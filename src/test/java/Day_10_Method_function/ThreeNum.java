package Day_10_Method_function;

public class ThreeNum {
	
	public int num(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if (b>a && b>c)
		{
			return b;
		}
		
		else
		{
			return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeNum tn= new ThreeNum();
		int result =tn.num(10, 20, 30);
		System.out.println(result +": is the greatest number");
		

	}

}
