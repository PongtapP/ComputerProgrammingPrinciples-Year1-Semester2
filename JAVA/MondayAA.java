import java.util.Scanner;
public class MondayAA
{
    static Scanner gloInput=new Scanner(System.in);

    static void line(){
		System.out.println("==================");
	}//end line 

	static String final1(){
       return "^__^"; 
	}//end final1

    static void show(int num){
        System.out.println("variable a: "+num);
	}//end show

	static double  del(double b,int c){
		return b-c;
	}//end del 

    static double inputDouble(){
		double num3=gloInput.nextDouble();
		return num3;
    }//end inputDouble

	static Integer inputInt(){
		int num4=gloInput.nextInt();
		return num4;
	}//end inputInt

	public static void main(String[] args) 
	{
		Scanner nana=new Scanner(System.in);
		int a = 10; 
		double result;
		line();
		double b =  nana.nextDouble();
		int c =  nana.nextInt();
        try
        {
            show(a);
			result = a / del(b,c);
            System.out.println("result" + result);
        }
        catch (ArithmeticException e)
        {
			System.out.println("ERROR!! "+e);
        }
        finally{
		System.out.println(final1());
	}
	line();
  } //end main
} //end class