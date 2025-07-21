class Manager extends Employee
{
	private String department;
	Manager(String name, double salary, Date birthDate, String department){
		super(name,salary,birthDate);
		this.department=department;
	}

	@Override
	public String toString(){
	return super.toString() + " department: "+department;
	}
}
