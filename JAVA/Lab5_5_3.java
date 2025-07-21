import java.util.Scanner;
import java.util.*;class  Lab5_5_3
{
	static int result; 
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] num=new int[3];
		System.out.println("Enter 3 Number");
		for (int i = 0; i < 3; i++) {
		System.out.print("Enter Number "+(i+1)+" : ");
		num[i] = input.nextInt();
		}//end for
		addArray(num);
		System.out.println("Summation = "+result);
	}
	static int addArray(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
		    sum = sum + num[i];
		}
		result = sum;
		return result;
	}//end addArray
}//end class
