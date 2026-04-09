package exception_handling1;

public class withoutEceptionHandler {

	public static void main(String[] args) {
		//A program that accepts 2 numbers as command line arguments and prints their additions
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args [1]);
		int result = x + y;
		System.out.println(result);
	}

}
