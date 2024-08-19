package ch06.sec15;

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	public String color = "red";
	
	private Singleton() {
		super();
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
