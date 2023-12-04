import java.util.Scanner
public class TestCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = sc.nextInt();
		System.out.println("enter the number2");
		int num2 = sc.nextInt();
		int ans = NumberService.addition(num1, num2);
		System.out.println("Addition: "+sum);
		ans=NumberService.add_digitss(num1);
		System.out.println("Add_digits: "+ans);
	}
}
