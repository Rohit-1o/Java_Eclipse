package java_project;

public class OnlineTraining extends Training{
	private String meetingLink;
	
	public OnlineTraining() {
		meetingLink = "https://meet.google.com/40580";
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}

	
	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}

	
	public void ConductTraining() {
		System.out.println("Conducting the training on " + getModuleName() + " for " + getDuration() + " hours using the link " + meetingLink);
	}
	
	// Override method
	public String getDetails() {
		String details = super.getDetails() + "\nmeeting link : " + meetingLink;
		return details;
	}
}
