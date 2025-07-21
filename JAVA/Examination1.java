import java.util.Scanner;
class Examination1 
{
	static int num;
	static int num1;
	static int num2;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		while (true)
		{
			System.out.print("Enter number 1 to devide: ");
			num1 = input.nextInt();
			System.out.print("Enter number 2 to devide: ");
			num2 = input.nextInt();
			if (num1<num2)
			{
				System.out.println("Invalid number "+num2+">"+num1);
				System.out.println("Enter again...");
				System.out.println();
			}//end if
			else{
				num=num1;
				break;
			}
		}//end while
		System.out.println();
		for (num=num1; num>=num2; num=num-num2 )
			{
				System.out.println("	"+num+" - "+num2+" = "+(num-num2));	
			}//end for
		System.out.println("	result = "+(num1/num2));
		System.out.println("That is "+num1+" / "+num2+" = "+(num1/num2)+" and reminder = "+num);
	}
}
