package ch06.sec08;

public class ComputerExample {

	public static void main(String[] args) {
		//Computer 객체 생성
		Computer myCom = new Computer();
		
		//sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
		//합산 결과를 리턴받아 result1 변수에 대입
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result1);
	}

}
