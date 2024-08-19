package ch08.sec10;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}
	
	public void destination(String des) {
		System.out.println("목적지는 " + des + "입니다.");
	}

}
