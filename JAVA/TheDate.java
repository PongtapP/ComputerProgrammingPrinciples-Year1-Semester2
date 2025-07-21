class TheDate 
{
	private int year, month, day;
	
	TheDate(){
		year=0;
		month=0;
		day=0;
	}
	TheDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
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