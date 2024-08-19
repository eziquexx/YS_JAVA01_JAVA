package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y; // 5.0
		//double z = x % y;
		
		//잘못된 코드
		System.out.println(z + 2); //Infinity
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) { //둘중 하나라도 있으면
			System.out.println("값 산출 불가");
		} else { // if 조건문이 없으면
			System.out.println(z + 2);
		}

	}

}
