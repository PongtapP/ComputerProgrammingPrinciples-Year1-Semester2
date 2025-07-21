import java.util.Scanner;
class Lab5_5_4 
{
	static String result;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String[] str = new String[5];
		System.out.println("Enter 5 strings");
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter String "+(i+1)+" : ");
				str[i] = input.nextLine();
			}//end for
		getUpperCase(str);
		System.out.println(result);
	}//end main
	static String getUpperCase(String[] str) {
		StringBuilder upper = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
		    upper.append(str[i].toUpperCase());
		}
		result=upper.toString();
		return result;
	}//end getUpperCase
}//end class
