package exception_handling1;

public class ThrowMain {
	private static int detDivision(int x, int y) {
		if (y==0) {
			String errorMessage = "Unable to divide as demonitar is 0";
				RuntimeException rx = new RuntimeException(errorMessage);
			throw rx;
		}
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(detDivision(100,0));
		}
		catch (RuntimeException runtimeEx) {
			String errMsg = runtimeEx.getMessage();
			System.out.println(errMsg);
		}
	}

}
