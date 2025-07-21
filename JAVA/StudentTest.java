class StudentTest 
{
	public static void main(String[] args) 
	{
		Lab5T aon = new Lab5T();
		aon.reverse("University");

		BookOne b1=new BookOne();
		//b1.setTitle("Computer");
		System.out.println(b1.getTitle());

		BookOne b2=new BookOne("Yodrak","Math");
		System.out.println(b2.getTitle()+" "+b2.getAuther());

		Student khim, mink, gina;
		khim = new Student();
		mink = new Student();
		gina = new Student("piyada");
		
		System.out.println("Hello World!"+khim.name);
		System.out.println("Hello World!"+mink.name);

		khim.name="siri";
		khim.test1=20;

		mink.name="atiporn";
		mink.test1=21;

		System.out.println("Hello World!"+khim.name+" "+khim.test1);
		System.out.println("Hello World!"+mink.name+" "+mink.test1);
		System.out.println("Hello World!"+gina.name+" "+gina.test1);

		System.out.println(Student.count);
	}
}