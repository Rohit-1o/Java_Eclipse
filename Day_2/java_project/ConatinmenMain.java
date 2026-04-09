package java_project;

public class ConatinmenMain {

	public static void main(String[] args) {
		Car simpleCar, premiumCar;
		simpleCar = new Car();//This Car does not have music system
		
		//Printing make of Simple Car
		System.out.println(simpleCar.getMake());
		
		//Print model of simple car
		System.out.println(simpleCar.getModel());
		
		
		
		//Print Power of engine available in Simple Car
		//Retrieving Engine of Simple Car
		Engine simpleEngine = simpleCar.getEngine();
		
		/* Step 1
		//Retrieving Power of Simple Car
		/*String simplePower = simpleEngine.getPower();
		System.out.println(simplePower);
		*/
		
		// Step 2
		String simplePower = simpleCar.getEngine().getPower();
		System.out.println(simplePower);
		
		Engine premiumEngine = new Engine("2600 CC", "Diesel");
		MusicSystem premiumMusicSystem=new MusicSystem("Sony","Dolby 3D");
		premiumCar = new Car("Toyota","Innova", premiumEngine, premiumMusicSystem);
		
		//Retrieving Power of an Engine of Premium Car
		String premiumPower = premiumCar.getEngine().getPower();
		System.out.println(premiumPower);
		
		/*String premiumSoundEffect = premiumCar.getMusicSystem().getSoundEffect();
		System.out.println(premiumSoundEffect);
		*/
		
		MusicSystem ms = premiumCar.getMusicSystem();
		if (ms != null ) { //If music system is available (music system not available means available || available means not available)
			String premiumSoundEffect = ms.getSoundEffect();
			System.out.println(premiumSoundEffect);
		}
		else
		System.out.println("This car does not have music system..");
	}
}
