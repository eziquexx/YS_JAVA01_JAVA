package ch08.sec11.exam01;

public class Car {
	Tire tireFront = new HankookTire();
	Tire TireBack = new HankookTire();
	
	void run() {
		tireFront.run();
		TireBack.run();
	}
}
