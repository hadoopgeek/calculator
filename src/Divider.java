import java.io.IOException;
import java.util.Scanner;


public class Divider 
{
	Scanner sc = new Scanner(System.in);
	public Divider()
	{
			
	}
	
	protected void finalize()
	{
		sc.close();
	}
	
	public void DoDivision() throws IOException
	{
		
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
						
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		
		int c = Divide(a,b);
		
		System.out.format("%d / %d = %d", a, b, c);
	}
	
	private int Divide(int a, int b) throws IOException
	{
		if(a != 0)
			return a/b;
		else
			return 0;
	}
}
