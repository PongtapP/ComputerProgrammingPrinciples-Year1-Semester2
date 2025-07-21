import java.util.Scanner;
class Lab5_5_2 
{
	static char result;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int Score = input.nextInt();
		getGrade(Score);
		System.out.println("Grade : "+result);
	}
	static char getGrade(int Score) {
		char grade;
		if (Score >= 80) {
		    grade = 'A';
		} else if (Score >= 70) {
		    grade = 'B';
		} else if (Score >= 60) {
		    grade = 'C';
		} else if (Score >= 50) {
		    grade = 'D';
		} else {
		    grade = 'F';
		}
		result=grade;
		return result;
	}//end getGrade
}//end class
