import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		System.out.println("Enter the decimal number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String oct = "";
		while(n>0)
		{
			int r = n%8;
			oct = r +oct;
			n = n/8;
		}
		System.out.println("Octal Equivalent:  "+oct);
	}
}
