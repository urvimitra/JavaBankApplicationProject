package bankapp;

public class Savings extends Account{
	
	//list properties specific to savings account
	private int safetyDepositBoxID, safetyDepositBoxKey;
	
	//constructor to initialize settings for savings properties
	public Savings(String name, String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID=(int) Math.random()*Math.pow(10, 3);
		safetyDepositBoxKey=(int) Math.random()*Math.pow(10, 4);
	}
	@Override
	public void setRate()
	{
		rate=getBaseRate()-0.25;
	}
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Saving ");

		super.showInfo();
		System.out.println(
				"Your savings accoun features" +
		"\nSafety Deposit Box ID: " +safetyDepositBoxID
		+"\nSafety Deposit Box Key: "+safetyDepositBoxKey);
		
	}

	//list any methods specific to savings accounts

}
