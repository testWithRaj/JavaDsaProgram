package Day_5_Array;

public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {2,3,4,5,6};
		
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum =sum+num[i];
		}
		
		//i = 0 > sum =0+2=2
		//1nd index=3, sum =2+3=5
		//2nd index =4, sum =5+4 =9
		//3rd index =5, sum =9+5 =15
		//4th index =6, sum =15+6
		
		System.out.println(sum);
		
		
		
		

	}

}
