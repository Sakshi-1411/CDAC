import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the value of n ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
