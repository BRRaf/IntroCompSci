
public class CarClass {

	private String make;
	private String model;
	private int year;
	private int totalmiles;
	private int gasSize;
	private int gasConsumed;
	private int milesused;
	
	public CarClass(String make, String model, int year, int gasSize) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.gasSize = gasSize;
		
		this.totalmiles = 0;
		this.gasConsumed = 0;
		this.milesused = 0;
		
	}
	
	
	//the getters
	public String getMake() {
		return make;
	}
	
	
	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getTotalMiles() {
		return totalmiles;
	}

	public int getGasSize() {
		return gasSize;
	}

	public int getGasConsumed() {
		return gasConsumed;
	}

	public int getMilesUsed() {
		return milesused;
	}

	//end of getters
	
	
	public int getMPG() {
	
		int mpg = milesused/gasConsumed;
		
		return mpg;
		
	}
	
	public void DriveCar(int numberofMiles) {
		
		totalmiles += numberofMiles;
		milesused += numberofMiles;
		
		
		
	}
	
	public void FillupTank(int gallonsUsed) {
		
		if (gallonsUsed < 0 || gallonsUsed > gasSize) {
			
			System.out.println("ERROR");
			
		} else {
		gasConsumed += gallonsUsed;
		milesused = 0;
		}
		
	}
	
	
	
	public String toString(){
		String rtnString = "The make: "+make+", model: "+model+", Year: "+year+", Total miles: "+totalmiles+", Size of the tank: "+gasSize+", Total Gallons consumed: "+gasConsumed+", Miles since the last fill up: "+milesused+", The MPG: "+getMPG();
		return rtnString;
	}

	
	

	
}
