import java.util.Scanner*;
class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long number=sc.nextLong();
		if(number<0)
				System.out.println("invalid");
		else if(number%2==0)
				System.out.println("Even");
		else
				System.out.println("Odd");
	}
}
