import java.util.Scanner;


public class TestArray1 {
 
	

	public static void main(String args[]) {
	    int x=12;
	    int val;
		int[] arr=new int[5];
		ArrayService.acceptData(arr);
		ArrayService.displayDat(arr);
	int sum=ArrayService.findSum(arr);
	
	int [] arr1=ArrayService.findALLGreaterVal(arr, val);
	ArrayService.displayDat(arr1);
	//int val = 13;
		
	}
}
