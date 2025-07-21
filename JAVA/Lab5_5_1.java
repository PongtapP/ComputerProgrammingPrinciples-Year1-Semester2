import java.util.Scanner;
import java.util.*;
class Lab5_5_1 {
	static Scanner input = new Scanner(System.in);
	static Double[] num=new Double[3];
	static double result;
	static int intResult;
	public static void main(String[] args) 
	{
		System.out.println("Enter 3 Number");
		for (int i = 0; i < 3; i++) {
		System.out.print("Enter Number "+(i+1)+" : ");
		num[i] = input.nextDouble();
		}//end for
		maxThree(num);
		System.out.println(intResult);
	}//end main
	static int maxThree(Double num[]){
		Arrays.sort(num);
		result = num[2];
		intResult = (int)result;
		return intResult;
	}//end maxThree
}//end class
