package exception_handling1;

public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1023, "Kartik", 65000);
		System.out.println(acc);
		acc.deposit(15000);
		System.out.println(acc);
		
		try {
			acc.withdraw(50000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			String errMsg = e.getMessage();
			System.out.println(errMsg);
		}
		System.out.println(acc);
	}

}
