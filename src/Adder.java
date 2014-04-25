import java.util.Scanner;


public class Adder 
{
	Scanner sc;
	public Adder()
	{
		sc = new Scanner(System.in);
	}
	protected void finalize()
	{
		sc.close();
	}
	public void DoAddition()
	{
		System.out.println("Addition...\n");
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		
		int c = Add(a,b);
		
		System.out.println("Sum is ... ");
		System.out.format("%d + %d = %d", a, b, c);
				
	}
	public int Add (int a, int b)
	{
		return (a+b);
	}
	
}
