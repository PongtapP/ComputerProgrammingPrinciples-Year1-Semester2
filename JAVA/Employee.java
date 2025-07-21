public class Employee{
	private String name;
	private double salary;
	private Date birthDate;
	
	public Employee(String name,double salary,Date birthDate){
		this.name=name;
		this.salary=salary;
		this.birthDate=birthDate;
	}
	public Employee(String name,Date birthDate){
		this.name=name;
		this.salary=0.0;
		this.birthDate=birthDate;
	}
	public Employee(){
		this.name="";
		this.salary=0.0;
		//this.birthDate=birthDate;
	}
	public String toString(){
	return "Name: "+name+" Salary: "+salary+" B.Date "+birthDate+" "+birthDate.getDay()
		   +" ,"+birthDate.getMonth()+" ,"+birthDate.getYear();
	}
}
