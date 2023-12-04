package Pattern;

import java.util.Scanner;

public class FilledBox {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of n");
			int n = sc.nextInt();
			for(int i=1;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
