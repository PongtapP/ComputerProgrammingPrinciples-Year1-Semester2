class PartTime extends Employee 
{
	private int partDay;
	PartTime(String name,Date birthDate,int partDay){
		super(name, birthDate);
		this.partDay=partDay;
	}
	public double pay(){
		return partDay*200;
	}
	public double pay(int rate){
		return partDay*rate;
	}
}
