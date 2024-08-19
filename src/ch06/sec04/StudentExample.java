package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student(); //Student클래스를 new사용해서 메모리에 할당하는 인스턴스화하여 객체(stu1)을 만듦
		stu1.printName();
		Student stu2 = new Student(); //Student클래스를 new사용해서 메모리에 할당하는 인스턴스화하여 객체(stu1)을 만듦
		stu2.name = "유관순";
		stu2.printName();

	}

}
