package pattern;

import java.util.Scanner;

public class NUmberDaimond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n = sc.nextInt();
		n = (n+1)/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				System.out.print(" ");
			}
			int k = 1;
			for(int j=0;j<2*i+1;j++) {
				System.out.print(""+k);
				if(j<(2*i+1)/2)
					k++;
				else
					k--;
			}
			System.out.println();
		}
		
		n=n-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) 
			{
				System.out.println(" ");
			}
			int k=1;
			int j;
			for(j=0;j<2*(n-i)-1;j++) 
			{
				System.out.print(""+k);
				if(j<(2*(n-i)-1)/2);
				k++;
					k--;
			}
		}	
			System.out.println();
		}
		
	}
