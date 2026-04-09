package IO_Programing;

import java.io.InputStream;
import java.util.Scanner;

public class AcceptUserInputMain {

	public static void main(String[] args) {
		// Obtaining an InputStream Specific to input device i.e Keyboard
		InputStream keyboard = System.in;
		try (
			Scanner scr = new Scanner(keyboard);
		) {
			System.out.println("Enter your full name : ");
			String fullname = scr.nextLine();
			System.out.println("Enter your height (cm) : ");
			int height = scr.nextInt();
			System.out.println("Enter your weight (kg) : ");
			float weight = scr.nextFloat();
			System.out.println(fullname);
			System.out.println(height);
			System.out.println(weight);
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
