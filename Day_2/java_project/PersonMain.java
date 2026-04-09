package java_project;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person pm = new Person();
			Person cm = new Person("Devendra Fadanvis",55);
			Person president = new Person(54, "Draupadi Murmu");
			System.out.println("Person Count :" + Person.PersonCount);
			
			for(int a=1;a<=5;a++) {
				Person pr = new Person();
			}
			System.out.println("PersonCount :" + pm.PersonCount);
			System.out.println("Person_Count :" + president.getPerson_Count());
			System.out.println("Person_Count :" + pm.getName());
	}

}
