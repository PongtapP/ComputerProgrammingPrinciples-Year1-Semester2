abstract class CustomerBank 
{
	private String idCustomer;
	private String nameCustomer;
	private TheDate birthDate;

	public CustomerBank(String id, String n, TheDate bDate){
		idCustomer=id;
		nameCustomer=n;
		birthDate=bDate;
	}
	public String toString(){
		return "Identity card: "+idCustomer+", Name: "+nameCustomer+", BirthDay:"+birthDate.getDay()+"/"+birthDate.getMonth()+"/"+birthDate.getYear();
	}
}
