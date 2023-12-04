import java.util.Scanner;

public class OctTodec {
	public static void main(String[] args)
	{
		System.out.println("ENter The Octal Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dec =0;
		int count =0;
		while(n>0)
		{
			int r = n%10;
			dec = dec + r*pow(8,count);
			count++;
			n/=10;
		}
		System.out.println("Decimal Equivalent:  "+dec);
	}
	static int pow(int n, int p)
	{
		int pw =1;
		while(p>0)
		{
			pw = pw*p;
			p--;
		}
		return pw;
	}
}
