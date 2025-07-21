class CustomerAccount extends CustomerBank
{
	private String idAccount;
	protected double balance;
	private int status;

	CustomerAccount(String idCustomer, String nameCustomer, TheDate birthDate){
		super(idCustomer,nameCustomer,birthDate);
		idAccount="No Account";
		status=0;
		balance=0.0;
	}
	CustomerAccount(String idCustomer, String nameCustomer, TheDate birthDate, String idAccount, int status, double balance){
		super(idCustomer,nameCustomer,birthDate);
		idAccount=setID(idAccount);
		status=setStatus(status);
		this.balance=balance;
	}
	public String getID(){
		return idAccount;
	}
	public int getStatus(){
		return status;
	}
	public String setID(String id){
		return idAccount=id;
	}
	public int setStatus(int s){
		return status=s;
	}
	public double getBalance(){
		return balance;
	}
	@Override
	public String toString(){
		return super.toString()+"\n====>::Bank Account Number: "+getID()+", Balance: "+getBalance()+", Status: "+getStatus();
	}
	public double deposit(double d){
		balance=balance+d;
		return balance;
	}
	public double withDraw(double d){
		if(d>balance){
			System.out.println("!!!!!!Sorry!!!. You don't withdraw "+d);
		}else{
			balance=balance-d;
		}
		return d;
	}
}
