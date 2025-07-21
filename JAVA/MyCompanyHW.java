class MyCompanyHW
{
	public static void main(String[] args) 
	{
		ManagerHW m1 = new ManagerHW("Aon", 20, 123, "Manager", "Sales");
		ManagerHW m2 = new ManagerHW("Wei", 35, 100, "Manager");
		FTEmployeeHW ft1 = new FTEmployeeHW("Fohk", 21, 456, "Engineer", 50000.0);
		PTEmployeeHW pt1 = new PTEmployeeHW("Khim", 19, 789, "Developer", 20.0, 25.0);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(pt1.toString());
		System.out.println(ft1.toString());
	}
}