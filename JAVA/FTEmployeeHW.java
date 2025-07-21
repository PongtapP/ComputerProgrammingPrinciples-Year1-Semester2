public class FTEmployeeHW extends EmployeeHW {
  private double salary;

  public FTEmployeeHW(String name, int age, int employeeID, String position, double salary) {
    super(name, age, employeeID, position);
    this.salary = salary;
  }
  public double getSalary() {
    return this.salary;
  }
  @Override
  public String toString() {
	return super.toString()+", Salary: "+salary;
  }
}