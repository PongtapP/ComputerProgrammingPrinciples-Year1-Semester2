class Lab4T
{
	public static void main(String[] args) 
	{
		String name="Rawiworn";
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
		}
		System.out.print(" ======> ");

		for(int i=(name.length())-1;i>-1;i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();

		StringBuilder s =new StringBuilder("Information of tecnology");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}