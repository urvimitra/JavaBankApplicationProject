package bankapp;

import java.util.List;

public class bankaccountapp {

	public static void main(String[] args) {

		String file="C:\\Users\\PM\\Desktop\NewBankAccounts.csv"
		/*to test- Checking chkacc1=new Checking("tom","32432423",1500);
		Savings savacc1=new Savings("rasfsd","324234",2000);
		savacc1.showInfo();
		chkacc1.showInfo();
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("brokerage",3000);
		savacc1.compound();*/
		//read a csv file then create new accounts based on that data
				List<Account> accounts=new LinkedList<Accounts>();
		List<String[]> newAccountHolders=utilities.CSV.read(file);
		for(String[] newAccountHolder : newAccountHolders)
		{
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings"))
				accounts.add(new Savings(name,sSN,initDeposit));
				
			else if(accountType.equals("Checking"))
				accounts.add(new Checking(name,sSN,initDeposit));
				
			else
				System.out.println("Error reading account type");
			
				
			
		}
		for(Account acc: accounts)
		{
			System.out.println("\n************");
			acc.showInfo();
		}
		//accounts.get((int)Math.random()*accounts.size()).deposit(500);
	}

}
