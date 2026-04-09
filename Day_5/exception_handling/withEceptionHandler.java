package exception_handling;

public class withEceptionHandler {

	public static void main(String[] args) {
		//A program that accepts 2 numbers as command line arguments and prints their additions
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args [1]);
			int result = x + y;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Enter at least 2 num");
		}
	}
}