import java.util.Scanner;

public class printalldivisorsofanumber {
	public static void divnum(int n,int i)
	{
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+",");

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number (n) :");
		int num=s.nextInt();
		System.out.println("enter number(i) :");
		int i=s.nextInt();
		divnum(num,i);
		s.close();
		

	}

}
