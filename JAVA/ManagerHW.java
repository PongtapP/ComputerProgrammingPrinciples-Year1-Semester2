public class ManagerHW extends EmployeeHW {
  private String department;

  public ManagerHW(String name, int age, int employeeID, String position, String department) {
    super(name, age, employeeID, position);
    this.department = department;
  }
  public ManagerHW(String name, int age, int employeeID, String position) {
    super(name, age, employeeID, position);
    this.department = "More than one Department";
  }

  public String getDepartment() {
    return this.department;
  }

  @Override
  public String toString() {
	return super.toString()+", Department: "+department;
  }
}