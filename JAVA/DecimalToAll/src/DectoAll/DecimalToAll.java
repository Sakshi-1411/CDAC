package DectoAll;

import java.util.Scanner;

public class DecimalToAll {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the base");
		int ba = sc.nextInt();
		System.out.println(ba+"  base equivalent  "+Convert(n,ba));
	}	
	
	static String Convert(int num, int base) {
		String st = "0123456789ABCDEF";
		String b ="";
		while(num>0)
		{
			int r = num%base;
			b=st.charAt(r)+b;
			num = num/base;
		}
		return b;
	}
	}
