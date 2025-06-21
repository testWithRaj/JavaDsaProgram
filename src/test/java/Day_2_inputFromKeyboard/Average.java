package Day_2_inputFromKeyboard;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Add marks for math");
	int math = sc.nextInt();
	System.out.println("Add marks for hindi");
	int hindi = sc.nextInt();
	System.out.println("Add marks for sci");
	int sci = sc.nextInt();
	
	int totalMarks= math+hindi+sci;
	
	float average=(float) totalMarks/3;
	
	System.out.println(totalMarks);
	System.out.println(average);
	
	
		

	}

}
