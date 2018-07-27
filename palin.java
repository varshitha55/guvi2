import java.util.Scanner;

class Value
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	                       	                        int dup1=num,dup=0,rem=0;
	                        while(num>0)
	                        {
	                        		rem=num%10;
	                        		dup=dup*10+rem;
	                        		num=num/10;
	                       }
	                       if(dup1==dup)
	                        System.out.println("yes");
	                        else
	                     System.out.println("no");
	}
}
