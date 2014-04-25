import java.util.Scanner;


public class Multiplicator 
{
	Scanner sc = new Scanner(System.in);
	public Multiplicator()
	{
		
	}
	
	protected void finalize()
	{
		sc.close();
	}
	
	public void DoMultiplication()
	{
		System.out.println("Multiplication...\n");
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		
		int c = Multiply(a, b);
		
		System.out.format("%d * %d = %d", a, b, c);
	}
	
	private int Multiply(int a, int b)
	{
		return (a *b);
	}
	
}
