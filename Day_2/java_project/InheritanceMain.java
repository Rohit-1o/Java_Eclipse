package java_project;

public class InheritanceMain {

	public static void main(String[] args) {
		CricketPlayer cp = new CricketPlayer();
		cp.setName("Rohit");
		cp.setAge(37);
		cp.setRuns(12435);
		
		//code to get and print values
		System.out.println(cp.getName());
		System.out.println(cp.getAge());
		System.out.println(cp.getRuns());
		
		
		//CricketPlayer cp2 = new CricketPlayer("Virat", 37, 15322);
	}

}
