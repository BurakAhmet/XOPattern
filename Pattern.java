import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to create a pattern");
		while(!input.hasNextInt())
		{
			System.out.println("Please enter integer only!");
			input.next();
		}
		int number = input.nextInt();
		for (int i=number; 0<i; i--)
		{
			for (int j =0; j<number; j++)
			{
				if(i-j==1 || i+j==number)
				{
					System.out.print("X");
				}
				else
				{
					System.out.print("O");
				}
			}
			System.out.println();
		}	
		input.close();
	}

}
