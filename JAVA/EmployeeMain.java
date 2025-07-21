class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee e1 =new Employee();
		//System.out.println("1. "+e1.toString());
		Employee e2 =new Employee("Yodrak",120.0,new Date(2000,1,25));
		System.out.println("2. "+e2.toString());
		Manager m1 =new Manager("kanom",150.0,new Date(1990,5,30),"Accounting");
		System.out.println("3. "+m1.toString());
		PartTime pt1 =new PartTime("MIT",new Date(2005,9,1),26);
		System.out.println("4. "+pt1.toString()+" "+pt1.pay());
		PartTime pt2 =new PartTime("NPU",new Date(2000,3,31),26);
		System.out.println("5. "+pt2.toString()+" "+pt2.pay(250));
	}
}