class TestAccount 
{
	public static void main(String[] args) 
	{
		System.out.println("===============Transsection Report===============");
		CustomerAccount A1 = new CustomerAccount("1-11-11", "Nang", new TheDate(2000,8,13));
		CustomerAccount A2 = new CustomerAccount("2-22-22", "Runya", new TheDate(1980,1,1), "2002", 0, 5000);
		CustomerAccount A3 = new CustomerAccount("3-33-33", "Naree", new TheDate(1999,4,30));
		System.out.println(A1.toString());
		System.out.println();
		System.out.println("==================OPEN ACCOUNT==================");
		System.out.print("******ID Account:"+A1.setID("1001"));
		System.out.println(" ++++>Deposit: "+A1.deposit(4500));
		System.out.print("******ID Account:"+A1.setID("1001"));
		System.out.println(" ---->Withdraw: "+A1.withDraw(3000));
		System.out.println();
		System.out.println(A1.toString());
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("===============Transsection Report===============");
		System.out.println(A2.toString());
		System.out.print("******ID Account:");
		System.out.println(" ++++>Deposit: "+A2.deposit(1050.5));
		System.out.print("******ID Account:");
		System.out.println(" ---->Withdraw: "+A2.withDraw(7000));
		System.out.println();
		System.out.println(A2.toString());
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("===============Transsection Report===============");
		A2.withDraw(6050.5);
		A2.setStatus(-1);
		System.out.println(A3.toString());
		System.out.print("******ID Account:"+A3.setID("3003"));
		System.out.println(" ++++>Deposit: "+A3.deposit(6050.5));
		System.out.println();
		System.out.println(A3.toString());
		System.out.println("-----------------------------------------------");
		System.out.println("================Summary Report================");
		System.out.println();
		System.out.println(A1.toString());
		System.out.println(A2.toString());
		System.out.println(A3.toString());
		System.out.println();
		System.out.println("==============================================");
	}
}
