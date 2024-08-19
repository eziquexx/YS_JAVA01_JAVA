package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.plus(10, 20);
		System.out.println(result1);
		cal.powerOff();
		
		System.out.println(plus(10, 20));
		
//		int x = 10;
//		int y = 4;
//		double result2 = cal.divide(x, y);
//		System.out.println("result2: " + result2);
//		cal.powerOff();
		
		int sum1 = cal.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println(sum1);
		
		int sum2 = cal.sum(1,2,3,4,5);
		System.out.println(sum2);
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int sum3 = cal.sum(nums);
		System.out.println(sum3);
	}
	
	public static int plus (int x, int y) {
		return x + y;
	}

}
