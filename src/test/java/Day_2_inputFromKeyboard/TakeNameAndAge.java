package Day_2_inputFromKeyboard;

import java.util.Scanner;

public class TakeNameAndAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name =sc.nextLine();
		
		System.out.println("Enter your age");
		int age =sc.nextInt();
		
		System.out.println("My name is: "+name +" And my age is: "+ age);
		

	}

}
