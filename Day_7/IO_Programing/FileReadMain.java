package IO_Programing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		String filepath = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\instructions.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filepath); // Stream is Opened
			while(true) { //Stream is in Use
				int charValue = fin.read();
				if (charValue == -1)
					break;
				char ch = (char)charValue;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fin.close(); //Stream is Close
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
