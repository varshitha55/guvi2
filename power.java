import java.util.Scanner;

class Value
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc=new Scanner(System.in);
	                         int  num=sc.nextInt();
	                         int power=sc.nextInt();
	                         int result=1;
	                         while(power!=0)
	                         {
	                         	result*=num;
	                         	power--;
	                         }
	                         System.out.println(result);
	}
}		
