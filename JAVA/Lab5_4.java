import java.util.Scanner;
class Lab5_4
{	
	static int i;
	static boolean foundL=false;
	static boolean foundO=false;
	static boolean foundV=false;
	static boolean foundE=false;
	static String text;
	static String input() {
	System.out.print("Enter Message : ");
	text = input.nextLine();
	return text;
	}//end input
	static Scanner input = new Scanner(System.in);
	static boolean L(String text){
		if(text.charAt(i)=='L'||text.charAt(i)=='l'){
			foundL=true;}
		return foundL;
	}//end L
	static boolean O(String text){
		if(text.charAt(i)=='O'||text.charAt(i)=='o'){
			foundO=true;}
		return foundO;
	}//end O
	static boolean V(String text){
		if(text.charAt(i)=='V'||text.charAt(i)=='v'){
			foundV=true;}
		return foundV;
	}//end V
	static boolean E(String text){
		if(text.charAt(i)=='E'||text.charAt(i)=='e'){
			foundE=true;}
		return foundE;
	}//end E
	static void test(boolean foundL,boolean foundO,boolean foundV,boolean foundE){
		if (foundL&&foundO&&foundV&&foundE) {
		System.out.println("LOVE");
		} else {
		System.out.println("The word LOVE is not found in the text, or it's not complete.");
		}
	}//end test
	public static void main(String[] args) 
	{
		input();
		for (i=0;i<text.length() ;i++ )
		{
			L(text);
			O(text);
			V(text);
			E(text);
		}
		test(foundL,foundO,foundV,foundE);
	}//end main
}//end class