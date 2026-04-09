package collections_framework;

import java.util.Stack;
import IO_Programing.SocialMedia;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack dataValues = new Stack();
		dataValues.add("Welcome to Collections");
		dataValues.add(true);
		int age = 25;
		dataValues.add(age);
		SocialMedia media = new SocialMedia("Instagram", 2025000);
		dataValues.add(media);
		dataValues.add(2, "I am somewhere in between..!!");
			
		int stackSize = dataValues.size();
		for (int index=0; index < stackSize; index++) {
			Object data = dataValues.get(index);
			System.out.println(data);
		}
		System.out.println("===================================================");
		for(Object data : dataValues)
			System.out.println(data);
	}

}
