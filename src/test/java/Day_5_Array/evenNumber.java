package Day_5_Array;

public class evenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print only even numbers from the array
		
		int num[] = {23,20,24,46,31,22};
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
			}
		}

	}

}
