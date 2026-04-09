package java_project;

import javax.management.StringValueExp;

public class SocialMediaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialMedia media = new SocialMedia();
		//media.name = "Whatsapp";
		//media.usage = 45;
		
		//System.out.println("Usage is :" + media.usage + " " + media.name);
		media.assignValues("Facebook", 32);
		String Values = media.getValues();
		System.out.println(Values);
		System.out.println(media.getValues());
	}

}
