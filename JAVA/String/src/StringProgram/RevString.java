package StringProgram;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		//convert the string to array
		for(int i=0;i<ch.length/2;i++) {
			char t = ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		st=new String(ch);
		
		System.out.println("Revserved string is: "+st);
	}
}
