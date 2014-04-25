import java.io.IOException;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("1  Addition");
		System.out.println("2  Subtraction");
		System.out.println("3  Multiplication");
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Select the operation to perform: ");
			int input = sc.nextInt();
			
			if(input > 0 && input < 4)
			{
				DoCalculation(input);
				break;
			}
			
			System.out.println("Invalid selection, please make valid selection");
		
		}while(true);
		
		sc.close();
	}
	
	private static void DoCalculation(int option)
	{
		switch(option)
		{
		case 1:
			 Adder add = new Adder();
			 add.DoAddition();
			 break;
		case 2:
			 Subtractor sub = new Subtractor();
			 sub.DoSubtraction();
			 break;
		case 3:
			 Multiplicator mul = new Multiplicator();
			 mul.DoMultiplication();
			 break;
			 
		}
	}
}
