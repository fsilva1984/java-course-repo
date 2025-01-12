package poo.relationship.oneToOneExample;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car();
		Motor motor = new Motor();

		System.out.println(motor.starting(myCar.start()));
		
//		myCar.accelerate();
//		myCar.accelerate();
//		myCar.accelerate();
//		System.out.println(myCar.accelerate());
		
		
		motor.mileage(myCar.accelerate());
		motor.mileage(myCar.accelerate());
		motor.mileage(myCar.accelerate());
		System.out.println(motor.mileage(myCar.accelerate()));
		
	}
}
