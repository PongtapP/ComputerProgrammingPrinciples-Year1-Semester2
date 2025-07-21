public class Date {
	private int year, month, day;
	
	Date(){
		year=0;
		month=0;
		day=0;
	}
	Date(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	Date(int month,int day){
		this.year=2023;
		this.month=month;
		this.day=day;
	}
	Date(String s){
		System.out.println("==========================================");
		System.out.println("Welcome "+s+" "+day+" "+month+" "+year);
		System.out.println("==========================================");
	}
	public void setDay(int d){}
	public void setMonth(int m){}
	public void setYear(int y){}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
}
