/*	a	sentence	containing	every	letter	of	the	alphabet*/
package StringProgram;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println("Given String: "+"\n" +s);
		String st = removeSpace(s);
		
		int d = check(st);
		if(d==-1)
			System.out.println(s+"\n"+"is not pangram");
		else
			System.out.println(s+"\n"+"is a pangram");
	}
	
	public static String removeSpace(String s) {
		char ch[] = s.toCharArray();
		//convert string to array
		
		String nstr="";
		for(int i=0;i<s.length();i++) {
			if(ch[i]!=' ') {
				nstr = nstr+ch[i];
			}
		}
		return nstr;
	}
	
	public static int check(String st) {
		int n = 26;
		
		/*if(s.length()<n){
		  return -1;
		  contain only 
		  }*/
		
		//use these lines only for perfect panagram i.e it must
		//26 letters(alphabets) without any repetition
		
		for(char i = 'A'; i<='Z';i++) {
			if((st.indexOf(i)<0) && (st.indexOf((char)(i+32))<0)){
				return -1;
			}
		}
		return 1; 
	}
}
