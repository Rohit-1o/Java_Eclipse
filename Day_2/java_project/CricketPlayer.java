package java_project;
// Sub Class, Derived, Child   // Super Class, Base, Parent
public class CricketPlayer extends Player {
	private int runs;
	
	
	/*public CricketPlayer(String v_name, int v_age, int v_runs) {
		super ( v_age, v_name);
		runs = v_runs;
		
	}*/
	

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public CricketPlayer() {
		System.out.println("CricketPlayer ()");
	}
}
