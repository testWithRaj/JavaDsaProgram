package Day_10_Method_function;

public class division_return {
	
	public float div(int a,int b)
	{
		float division =(float)a/b;
		return division;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division_return dv= new division_return();
	float result=	dv.div(19, 2);
	System.out.println(result);

	}

}
