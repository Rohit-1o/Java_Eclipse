package collections_framework;

import java.util.Stack;

import javax.swing.PopupFactory;

import IO_Programing.SocialMedia;

public class StackMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack dataValues = new Stack();
		
		//==== PUSH ====
		dataValues.push(100);
		dataValues.push(200);
		dataValues.push(300);
		dataValues.push(400);
		dataValues.push(500);
		
		//==== Method-1 ====
		/*int stackSize = dataValues.size();
		for (int index=0; index < stackSize; index++) {
			Object data = dataValues.get(index);
			System.out.println(data);
		}
		System.out.println("===================================================");*/
		
		//==== Method-2 ==== 
		for(Object data : dataValues)
			System.out.println(data);
		System.out.println("Current Size : "+dataValues.size());
		System.out.println("====================");
		
		//==== POP ====
		Object popedObject = dataValues.pop();
		System.out.println("Popped Object : " + popedObject);
		System.out.println("Current Size : "+dataValues.size());
		System.out.println("====================");
		
		//==== PEEK ====
		Object peekedObject = dataValues.peek();
		System.out.println("Peeked Object : " + peekedObject);
		System.out.println("Current Size : "+dataValues.size());
	}

}
