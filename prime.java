import java.util.Scanner;

class Value
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	          int count=0;
	                        for(int i=1;i<=num;i++)
	                        {
	                        	if(num%i==0)
	                        	count++;
	                        }
	                        if(count==2)
	                        System.out.println("yes");
	                        else
	                     System.out.println("no");
	}
}               	                        
