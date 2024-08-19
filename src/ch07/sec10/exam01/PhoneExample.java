package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();	// Phone 클래스에 abstract키워드를 사용했기 때문에 인스턴스 생성 못함.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
