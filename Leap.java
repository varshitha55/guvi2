import java.util.Scanner;

class Greater
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		long year=sc.nextLong();
		if(year%4==0)
			System.out.println("yes");
			else
			System.out.println("no");	
	}
}
