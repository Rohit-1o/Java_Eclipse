package java_project;
	

public class Car {
	private String make;
	private String model;
	private Engine engine;
	private MusicSystem musicSystem;
	
	public Car() {
		make = "Maruti Suzuki";
		model = "Alto K10";
		engine = new Engine();
		//Not initalizing musicSystem because this Car does not have it.
	}

	public Car(String make, String model, Engine engine, MusicSystem musicSystem) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.musicSystem = musicSystem;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	
}// Car SimpleCar = new Car();//This Car does no have musicSystem
