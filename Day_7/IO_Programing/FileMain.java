package IO_Programing;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\instructions.txt";
		String path2 = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets";
		String path3 = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\new_instructions.txt";
	
	
		File file1 = new File(path1);
		File file2 = new File(path2);
		File file3 = new File(path3);
		
		System.out.println(file1.exists()); // exists
		System.out.println(file2.exists());
		System.out.println(file3.exists());
		System.out.println("======Exists=======");
		System.out.println(file1.isFile()); // isFile
		System.out.println(file2.isFile());
		System.out.println(file3.isFile());
		System.out.println("=======isFile=======");
		System.out.println(file1.isDirectory()); // Directory
		System.out.println(file2.isDirectory());
		System.out.println(file3.isDirectory());
		System.out.println("=======Directory=======");
		System.out.println(file1.mkdir()); // mkDir
		System.out.println(file2.mkdir());
		System.out.println(file3.mkdir());
		System.out.println("=======mkdir======");
		
	}

}
