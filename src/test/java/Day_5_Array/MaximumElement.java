package Day_5_Array;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]  = {1,2,3,4,5,6,7};
		//find the max element in array =7?
		//assume first element is max
		//iterate through each element and compare with the max
		//if any element is >max, then update that element as max
		
		int max= num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
			max=num[i];
			}
		}
		
		System.out.println(max);

	}

}
