package exception_handling1;

public class ThrowsMain {
	public static void methodA() throws Exception {
		//May throw an exception : Exception but not willing to handle it rather its caller must handle it
	}
	
	public static void methodB() {
		//invoking methodA()
		try {
			methodA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}
		private static void methodC() throws Exception {
			//invoking methodA()
			methodA();	
		}
		
		private static void methodD() throws ArithmeticException {
			
		}


	public static void main(String[] args) {
		methodB();
		try {
			methodC();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		methodD();
		//Since this method may throw and ArithmeticException that is an Unchecked exception, throwa does not create any impact
	}

}
