public class PTEmployeeHW extends EmployeeHW {
  private double hourlyRate;
  private double hoursWorked;

  public PTEmployeeHW(String name, int age, int employeeID, String position, double hourlyRate, double hoursWorked) {
    super(name, age, employeeID, position);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public double getHoursWorked() {
    return this.hoursWorked;
  }

  public double calculatePay() {
    return this.hourlyRate * this.hoursWorked;
  }

  @Override
  public String toString() {
	return super.toString()+", Rate/Hours: "+hourlyRate+", Hours: "+hoursWorked+ ", Pay: "+calculatePay();
  }
}