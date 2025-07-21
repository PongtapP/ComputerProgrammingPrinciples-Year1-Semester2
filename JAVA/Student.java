public class Student {
	public static int count = 23;
	public String name; // Student name.
	public double test1, test2, test3; // Grades on three tests.

	Student(){
		name = "Not name!!!";
	}

	Student(String s){
		name = s;
	}

	public double getAverage() { // compute average test grade
		return (test1 + test2 + test3) / 3;
	}
} // end of class Student

class Loma
{
}