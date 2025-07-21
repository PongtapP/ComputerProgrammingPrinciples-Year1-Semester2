import java.util.*;
class Examination
{
	static Double[] arr;
	static Scanner input=new Scanner(System.in);
	static int i; static Double result;
	public static void main(String[] args) 
	{
		addArr();
		maxArr(arr);
		minArr(arr);
		sumArr(arr);
	}//end main
	static Double[] addArr(){
	 arr=new Double[10];
		for (i=0; i<10; i++)
		{
			System.out.print("Enter num "+(i+1)+" : ");
			arr[i]=input.nextDouble();
		}
		return arr;
	}//end addArr
	static void maxArr(Double[] arr){
		Arrays.sort(arr);
		result=arr[9];
		System.out.println("Maximun number : "+result);
	}// end maxArr
	static void minArr(Double[] arr){
		Arrays.sort(arr);
		result=arr[0];
		System.out.println("Minimun number : "+result);
	}// end maxArr
	static void sumArr(Double[] arr) {
		Double sum = 0.0;
		for (i = 0; i < arr.length; i++) {
		    sum = sum + arr[i];
		}
	System.out.println("Sum of All number : "+sum);
	}//end sumArr
}//end class