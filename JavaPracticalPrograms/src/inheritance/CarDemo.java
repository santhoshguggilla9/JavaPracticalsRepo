package inheritance;

public class CarDemo extends HyundaiCar{

	public static void main(String[] args) {
		
		CarDemo car1 = new CarDemo();
		
		car1.carMileage();
		car1.carSpeed();
		
		car1.carColor();
		car1.carName();

	}

}
