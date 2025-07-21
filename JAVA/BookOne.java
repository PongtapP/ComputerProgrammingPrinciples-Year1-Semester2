class BookOne 
{
	private String title;
	private String auther;

	BookOne(){
		title="???";
		auther ="unname!!!";
	}

	BookOne(String s){
		title = "???";
		auther = s;
	}

	BookOne(String s0,String s1){
		title = s1;
		auther = s0;
	}

	public String getTitle(){
		return title;
	}

	public String getAuther(){
		return auther;
	}

	public void setTitle(String s){
		title=s;
	}
}
