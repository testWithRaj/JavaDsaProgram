package Day_5_Array;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,6,8,9,11};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
				count++;
			}
		}
		
		System.out.println("total count of odd number is: "+count);
		

	}

}
