package Pattern;

import java.util.Scanner;

public class EquilateralTriangle {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			for(int j=0;j<n-i-1;j++) 
			{
				System.out.print("_");
			}
		
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
