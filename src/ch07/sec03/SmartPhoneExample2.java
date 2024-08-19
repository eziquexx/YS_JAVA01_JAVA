package ch07.sec03;

public class SmartPhoneExample2 {

	public static void main(String[] args) {
		//SmartPhone2 객체 생성
		SmartPhone2 myPhone = new SmartPhone2("갤럭시", "은색");
		
		//Phone2로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

	}

}
