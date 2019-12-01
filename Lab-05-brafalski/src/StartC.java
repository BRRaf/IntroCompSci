
public class StartC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CarClass car1 = new CarClass("Hyundai", "Sonata", 2009, 15);
		
		CarClass car2 = new CarClass("Toyota", "Camri", 2015, 11);
		
		car1.FillupTank(15);
		
		car1.DriveCar(300);
		
		car1.getMPG();
		
		
		System.out.println(car1.toString());
		
		car2.FillupTank(11);
		
		car2.DriveCar(400);
		
		car2.getMPG();
		
		
		System.out.println(car2.toString());
		
	}

}
