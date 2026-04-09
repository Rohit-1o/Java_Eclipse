package java_project;

public class Person {
	private String name;
	private int age;
	static int PersonCount;
	private static int Person_Count;
	//number of person => PersonCount
	
	public int getPerson_Count() { // Non Static Method
		return Person_Count; // Static Variable
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
		PersonCount++;
		Person_Count++;
		name = "Narendra Modi";
		age = 23;
	}

	public Person(String name, int age) {
		PersonCount++;
		Person_Count++;
		this.name = name;
		this.age = age;
	}	

	public Person(int age, String name) {
		PersonCount++;
		Person_Count++;
		this.age = age;
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
