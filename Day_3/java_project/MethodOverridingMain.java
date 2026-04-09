package java_project;

public class MethodOverridingMain {

	public static void main(String[] args) {
		OfflineTraining offlineTrg = new OfflineTraining();
		offlineTrg.ConductTraining();
		
		
		OnlineTraining onlineTrg = new OnlineTraining("React JS", 40 ,"https//meet.google.com");
		onlineTrg.ConductTraining();
		
		System.out.println("===============================");

		System.out.println(offlineTrg.getDetails());
		System.out.println("===============================");
		System.out.println(onlineTrg.getDetails());
	}

}
