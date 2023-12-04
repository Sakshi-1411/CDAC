
public class Prime {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Prime number between 1 and " + n );
		
		//loop through the number one by one
		for(int i=1; i<n ; i++)
		{
			boolean isPrime =  true;
			//check to see if the number is prime
			for(int j=2; j<i; j++)
			{
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			//prime the number
			if(isPrime)
				System.out.println(i + " ");
		}
	}
}
