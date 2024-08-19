package ch08.sec11.exam01;

public class MainExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
	
		//금호타이어로 변경해보기.
		myCar.tireFront = new KumhoTire();
		myCar.TireBack = new KumhoTire();
		myCar.run();
		
	}
	
	

}
