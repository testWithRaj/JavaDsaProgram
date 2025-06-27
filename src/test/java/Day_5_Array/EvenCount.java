package Day_5_Array;

public class EvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,6,8,9,11,12,12};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
		count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
