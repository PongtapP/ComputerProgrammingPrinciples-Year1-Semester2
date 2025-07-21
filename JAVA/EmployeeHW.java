public class EmployeeHW {
  private String name;
  private int age;
  private int employeeID;
  private String position;

  public EmployeeHW(String name, int age, int employeeID, String position) {
    this.name = name;
    this.age = age;
    this.employeeID = employeeID;
    this.position = position;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getEmployeeID() {
    return this.employeeID;
  }

  public String getPosition() {
    return this.position;
  }

  public String toString() {
	return "Name: "+name+", Age: "+age+", ID: "+employeeID+", Position: "+position;
  }
}