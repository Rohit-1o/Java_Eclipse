package collections_framework;

import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector dataValues = new Vector();
		System.out.println("Current Size : "+ dataValues.size());
		System.out.println("Current Capacity : "+ dataValues.capacity());
		System.out.println("=======================");
		for (int x=1; x<=10; x++)
		dataValues.add(x);
		System.out.println("Current Size : "+ dataValues.size());
		System.out.println("Current Capacity : "+ dataValues.capacity());
		System.out.println("=======================");
		dataValues.add(5);
		System.out.println("Current Size : "+ dataValues.size());
		System.out.println("Current Capacity : "+ dataValues.capacity());
		System.out.println("=======================");
		
	}

}
