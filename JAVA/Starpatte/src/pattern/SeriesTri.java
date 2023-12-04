package pattern;

import java.util.Scanner;

public class SeriesTri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();
		int k = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				k++;
				System.out.print(k+"_");
			}
				System.out.println("_");
		}
	}
}
