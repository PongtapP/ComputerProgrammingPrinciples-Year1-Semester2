import java.util.Scanner;
class Lab5T 
{
	static Scanner gloInput=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		reverse(input());
	}
	static String input(){
		String n=gloInput.nextLine();
		return n;
	}
	static void reverse(String n){
		for(int i=(n.length())-1;i>-1;i--)
		{
			System.out.print(n.charAt(i));
		}
		System.out.println();
	} 
}
