package ch08.sec10;

public class MainExample {

	public static void main(String[] args) {
		Vehicle taxi3 = new Taxi2();
		taxi3.run();
		
		
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
//		((Bus)vehicle).checkFare();
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		bus.run();
		
		System.out.println("-----------------------------");
		
		//taxi 목적지를 정하다, 달리다.
		Vehicle vehicle2 = new Taxi();
		vehicle2.run();
		Taxi taxi = (Taxi)vehicle2;
		taxi.destination("장안구 영화동");
		
		System.out.println("-----------------------------");
		
		//tank 대포쏜다, 달리다.
		Vehicle vehicle3 = new Tank();
		vehicle3.run();
		Tank tank = (Tank)vehicle3;
		tank.cannon();
		tank.run();
	}

}
