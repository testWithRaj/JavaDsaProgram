package Day_6_7BasicsStrings;

public class PlanidromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
			
		}
		if (rev.equals(rev))
		{
			System.out.println("this is palindrome ");
		}
		else 
		{
			System.out.println("this is not palindrome ");
		}

	}

}
