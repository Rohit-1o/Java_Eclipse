package java_project;

public class OfflineTraining extends Training {
	private String venue;
	
	public OfflineTraining() {
		venue = "YCP Mumbai";
	}

	public OfflineTraining(String venue, int duration, String moduleName) {
		super(moduleName, duration);
		this.venue = venue;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	
	//Override method
	
	@Override
	public void ConductTraining() {
		System.out.println("Conducting the training on " + getModuleName() + " for " + getDuration() + " hours at " + venue);
	}
	
	@Override
	public String getDetails() {
		String details = super.getDetails() + "\n"
				+ "Venue : " + venue;
		return details;
	}

}
