
public class MirrorRighttri {

	{
		 public	static	void	main(String[] args)	 {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter the value of n");
			int n = sc.nextInt();
			for(int i=1;i<n;j++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j>n-1)
					System.out.println("*");
				else
					System.out.println(" ");
				}
				System.out.println();
			}
			
		}
	
}
