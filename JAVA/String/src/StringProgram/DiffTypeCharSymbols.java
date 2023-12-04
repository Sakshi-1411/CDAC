/*Write a program to display number of LOWERCASE, UPPERCASE,
SPECIAL SYMBOLS, SPACES and DIGITS in a STRING*/
package StringProgram;

import java.util.Scanner;

public class DiffTypeCharSymbols {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st =sc.nextLine();
		char ch[] = st.toCharArray();
		int uc=0,lc=0,spc=0,dc=0,sp=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65&&ch[i]<=90) {
				uc++;
			}
			else if(ch[i]>=97&&ch[i]<=122) {
				lc++;
			}
			else if(ch[i]>=48&&ch[i]<=57)
				dc++;
			else
				if(ch[i]==' ')
					sp++;
				else spc++;
		}
		System.out.println("No: of upper case letter "+uc);
		System.out.println("No: of lower case letter "+lc);
		System.out.println("No: of decimal case letter "+dc);
		System.out.println("No: of spaces"+sp);
		System.out.println("No: of special characters"+spc);
				
	}
}
