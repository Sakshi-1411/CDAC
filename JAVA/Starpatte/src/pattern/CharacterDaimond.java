package pattern;

import java.util.Scanner;

public class CharacterDaimond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		n = (n+1)/2;
		char ch = 'A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				System.out.print("_");
			}
			int k=0;
			for(int j=0;j<2*i+1;j++) {
				System.out.print(""+(char)(ch+k));
				if(j<(2*i+1)/2)
					k++;
				else
					k--;
			}
			System.out.println();
		}
		
		n=n-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("_");
			}
			int k=0;
			for(int j=0;j<2*(n-i)-1;j++) {
				System.out.print(""+(char)(ch+k));
				if(j<(2*(n-i)-1)/2)
					k++;
				else
					k--;
			}
			System.out.println();
		}
	}
}
