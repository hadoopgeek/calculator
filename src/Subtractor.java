import java.util.Scanner;


public class Subtractor
{
	Scanner sc = new Scanner(System.in);
	public Subtractor()
	{
		
	}
	
	public void finalize()
	{
		sc.close();
	}
	
	public void DoSubtraction()
	{
		System.out.println("Subtraction...\n");
		System.out.println("Enter First Number : \n");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number : \n");
		int b = sc.nextInt();
		
		int c = Subtract(a, b);
		
		System.out.println("Subtraction is ... ");
		System.out.format("%d - %d = %d", a, b, c);
	}
	
	private int Subtract(int a, int b)
	{
		return (a-b);
	}
}
