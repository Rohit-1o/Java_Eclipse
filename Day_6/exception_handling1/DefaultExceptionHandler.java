package exception_handling1;

public class DefaultExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args [1]);
			int result = x / y;
			System.out.println(result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Enter 2nd number non-zero");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Entered at least 2 num");
		}
		
		catch(Exception ex) {
			//This block can handle any type of exception
			System.out.println("Unable to proced due to sum wrong input..!!");
		}
		
		finally {
			System.out.println("Thank You..!!");
		}
		
		/*catch(ArithmeticException | ArrayIndexOutOfBoundsException ex ) {
			if (ex instanceof ArithmeticException)
				System.out.println("Enter 2nd number non-zero");
			else
		}*/
	}
}