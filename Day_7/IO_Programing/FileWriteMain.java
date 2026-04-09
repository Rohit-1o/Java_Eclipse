package IO_Programing;

import java.io.FileOutputStream;

public class FileWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\Oath.txt";
		
		String ourOath =/* """
				1. We will come at 7am Sharp
				2. We will study well
				3. We will not remain absent
				4. We will not leave before 10:30pm
				""" */
				"""
				5. We will come at Sunday also		
				6. We will study hard
				""";
		try (FileOutputStream fout = new FileOutputStream(filepath, true)) {
			byte[] data = ourOath.getBytes();
			fout.write(data);
			System.out.println("Data is reutrn to file");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
