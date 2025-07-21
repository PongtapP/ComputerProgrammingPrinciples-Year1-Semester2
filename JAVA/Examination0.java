import java.util.Scanner;
class Examination0 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter youe name :");
		String name = input.nextLine();
		System.out.print("Enter youe score1 :");
		int score1 = input.nextInt();
		System.out.print("Enter youe score2 :");
		int score2 = input.nextInt();
		System.out.println();
		System.out.println("==========Summary==========");
		System.out.println("Name : "+name);
		System.out.println("and Total Score : "+score1+"+"+score2+"="+(score1+score2));
		System.out.println("===========================");
	}
}
