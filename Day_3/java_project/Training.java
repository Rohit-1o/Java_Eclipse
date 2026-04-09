package java_project;

public class Training {
	private String moduleName;
	private int duration; //hours
	
	public Training() {
		moduleName = "OOP using Java";
		duration = 60;
	}
	
	
	public Training(int duration, String moduleName) {
		super();
		this.duration = duration;
		this.moduleName = moduleName;
	}
	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}

	

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	public void ConductTraining() {
		System.out.println("Conducting the training on" + moduleName);
	}
	
	
	public String getDetails() {
		String details = "Module Name : " + moduleName + "\nDurations(hrs) : " + duration;
		return details;
	}
}

