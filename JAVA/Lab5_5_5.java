class Lab5_5_5 
{
	static int result;
	public static void main(String[] args) 
	{	
		int a=1+1;
		int b=2;
		int c=3;
		boolean value = (a==b);
		getBool(value);
		System.out.println(result);
	}
	static int getBool(boolean value) {
		int x;
			if (value==true)
			{
				x=1;
			}else{
				x=0;
			}
		result=x;
		return result;
	}//end getBool
}//end class
