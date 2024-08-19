package ch06.sec06;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	//생성자는 리턴형이 없음.
	//생성자는 클래스 이름과 동일.
	public Car() {
		System.out.println("이 함수가 생략됐다고 하는데 진실인가요?");
		this.company = "기아자동차";
//		System.out.println(this.company);
	}
	
	public Car(String company) {
		System.out.println("이 함수는 오버로드된 생성자입니다.");
		this.company = company;
	}
}
