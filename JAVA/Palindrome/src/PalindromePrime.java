import java.util.Scanner;
class PalindromePrime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number");
		int n = sc.nextInt();
		int t = n;
		int rev = 0;
		int i;
		while(n!=0)
		{
			rev = rev * 10 +(n%10);
			n = n/10;
		}
		if(rev==t)
		{
			for(i=2;i<rev;i++)
			{
				if(rev%i==0)
				{
					System.out.println("is not aprime number");
					break;
				}
			}
			if(rev==i) 
				System.out.println(t+"is a prime palindrome number");
		}
		else
			System.out.println(t+"is not a prime palindrome number");
	}
}
