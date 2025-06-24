package Day_5_Array;

import java.util.Scanner;

public class takeInputAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
	int first=	sc.nextInt();
	int second=	sc.nextInt();
	int third=	sc.nextInt();
	int fourth=	sc.nextInt();
	int fifth=	sc.nextInt();
	
	int values[] = {first,second,third,fourth,fifth};
	
	for (int i=0;i<values.length;i++)
	{
		System.out.println(values[i]);
	}
	
	
		

	}

}
