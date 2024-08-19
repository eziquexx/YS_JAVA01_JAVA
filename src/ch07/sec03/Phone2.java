package ch07.sec03;

public class Phone2 {
	//필드 선언
	public String model;
	public String color;
		
	//기본 생성자 선언
	public Phone2(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}
}
