package pattern;

public class MirrorRigthtriangleDOwn {
	public static void main(String[] args) {
 java.util.Scanner sc = new java.util.Scanner(System.in);
 	System.out.println("Enter the value of n");
 	int n = sc.nextInt();
 	for(int i= 1; i<n;i++) {
 		{
 			for(int j=0;j<n;j++)
 			{
 				if(i+j<=n-1)
 					System.out.print("*");
 				else
 					System.out.print(" ");
 			}
 			System.out.println();
 		}
 	}
	}
}
