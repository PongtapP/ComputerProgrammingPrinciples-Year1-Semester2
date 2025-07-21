import java.util.Scanner;
class Lab5TT 
{
	static Scanner input = new Scanner(System.in);
	static int n[]=new int[5];

	static void inputScore(String name[]){
	System.out.println("\n=======Input Score=======");
	for(int i=0;i<name.length;i++){
	System.out.print("Score"+(i+1)+":"+name[i]+": ");
	
	n[i]=input.nextInt();
	}
	System.out.println();
	}//end innputScore()

	static void showScore(String name[]){
	System.out.println("========Show Data========");
	for (int i=0;i<name.length ;i++ ){

	System.out.print(" "+(i+1)+": "+name[i]);
	System.out.println("\t :Score"+": "+n[i]);

	}
	System.out.println();
	}//end showScore()
	
	static void sumScore(){
	System.out.println("=========Show Sum=========");
	double sum=0.0;
	for (int i=0;i<n.length ;i++ ){
	sum=n[i]+sum;
	}
	System.out.println(" ::Sum is"+":: "+sum);
	System.out.println("::Average is"+":: "+sum/n.length);
	System.out.println("=========================\n");
	}//end sumScore()

	public static void main(String[] args)
	{
	String name[]=new String[5];//local variable
	System.out.println("=======Input Data=======");
	for (int i=0;i<name.length ;i++ ){
	System.out.print(" Name "+(i+1)+": ");
	name[i]=input.next();
	}
	inputScore(name);
	showScore(name);
	sumScore();
	}//end main
}