package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = "버스";
		System.out.println("kind2: " + kind2);
//		System.out.println("kind1: " + kind1);
//		System.out.println("hobby: " + hobby);


	}

}
