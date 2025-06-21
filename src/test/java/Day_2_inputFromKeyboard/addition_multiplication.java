package Day_2_inputFromKeyboard;

import java.util.Scanner;

public class addition_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int firstnum=sc.nextInt();
		
		System.out.println("enter second number");
		int secondnum = sc.nextInt();
		
		int sum=firstnum+secondnum;
		
		int diff =firstnum-secondnum;
		
		float mul=firstnum*secondnum;
		
		float div = firstnum/secondnum;
		
		System.out.println("sum: "+sum +" diff: "+" mul: "+mul+ " div: "+div);

	}

}
