import java.util.Scanner;
public class InputFromKeyBoard {
	public static void main(String args[])

	{
		Scanner keyboard=new Scanner(System.in); 
		
		System.out.println("Input you name");
		String abc=keyboard.nextLine();
		
		System.out.println(abc);
		
		System.out.println("Enter you age");
		int age=keyboard.nextInt();
		
		System.out.println("your age is :" + age);
	}
}
