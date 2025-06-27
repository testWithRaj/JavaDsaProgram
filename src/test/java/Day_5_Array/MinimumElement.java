package Day_5_Array;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,27,28,19,20};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("minimum element in an array is: "+min);
		

	}

}
