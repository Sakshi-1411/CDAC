package StringProgram;

import java.util.Scanner;

public class Countword {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String s = sc.nextLine();
		 String nstr = " ";
		 int nc = 0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)==' ') {
				 nstr = nstr+nc;
				 nc=0;
			 }
			
			 else {
				 nc++;
				 nstr = nstr +s.charAt(i);
			 }
		 }
		 nstr=nstr+nc;
		 System.out.println(  );
		 System.out.println("No of charcter in each word in string is: "+ nstr );
	 }
}
