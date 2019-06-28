package bankapp;

public class Checking extends Account{
	
	//list properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	//constructor to initialize settings for the checkings properties
	public Checking(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();

	}
	@Override
	public void setRate()
	{
		rate=getBaseRate()*0.15;
		
	}
	private void setDebitCard()
	{
		debitCardNumber=(int) Math.random()*Math.pow(10, 12);
		debitCardPin=(int) Math.random()*Math.powe(10,4);
	}
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking ");

		super.showInfo();
		System.out.println("Checking Account Features: \nDebit Card No.: "+debitCardNumber+"\nDebit Card Pin: "+debitCardPin");
		
	}

	//methods specific to checkings account
}
