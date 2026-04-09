package IO_Programing;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\social_media.txt";
		try (
				FileOutputStream fout = new FileOutputStream(filepath);
				ObjectOutputStream out = new ObjectOutputStream(fout)
				) {
			SocialMedia sm = new SocialMedia("Facebook", 1500000);
			out.writeObject(sm);
			System.out.println("Object Serialized..!!");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
