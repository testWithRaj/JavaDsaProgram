package patternPrinting_9_day;

public class rightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *       *
		 *       **
		 *       ***
		 *       ****
		 * 
		 * 
		 * s
		 * 
		 * */
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}

	}

}
