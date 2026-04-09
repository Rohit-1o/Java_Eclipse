package java_project;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account();
		myAccount.setAccounts(56080);
		myAccount.setName("Rohit Goud");
		myAccount.setBalance(70000);
		myAccount.setType("Savings");
		
		String info = myAccount.getName() + " holds " + myAccount.getType() + " account with balance of Rs." + myAccount.getBalance() + " and his account no. is " + myAccount.getAccounts();
		System.out.println(info);
	}

}
