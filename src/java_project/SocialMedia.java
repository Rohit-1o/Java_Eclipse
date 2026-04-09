package java_project;

public class SocialMedia {
	private String name;
	private int usage; //percentage
	
	// A method to assign values
	public void assignValues(String nm, int us) {
		name = nm;
		usage = us;
	}
	
	public String getValues() {
		String modelinfo = "Name :" +name +"\nUsage %" +usage;
				return modelinfo;
	}
}
