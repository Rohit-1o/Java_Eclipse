package IO_Programing;

import java.io.RandomAccessFile;

public class RandomAccessFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\instructions.txt";
		try ( 
			RandomAccessFile rf = new RandomAccessFile(filepath, "r")
			){
			long size = rf.length();
			long middPosition = size / 2;
			rf.seek(middPosition);
			
			while (true) {
				int charValue = rf.read();
				if(charValue == -1)
					break;
				char ch =(char)charValue;
				System.out.print(ch);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
