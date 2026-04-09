package IO_Programing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filepath = "C:\\Users\\exam\\eclipse-workspace\\java_project\\Day_7\\IO_Programing\\Assets\\social_media.txt";
		try (
				FileInputStream fin = new FileInputStream(filepath);
				ObjectInputStream in = new ObjectInputStream(fin)
				) {
			Object loadedObject = in.readObject();
			System.out.println(loadedObject);
			SocialMedia media = (SocialMedia)loadedObject;
			System.out.println(media.getName());
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
