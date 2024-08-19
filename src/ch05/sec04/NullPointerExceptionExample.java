package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[] {1, 2, 3, 4, 5};
		
//		intArray[0] = 10;
//		if(intArray != null) {
//			intArray[0] = 10;
//		}
		System.out.println(intArray[0]);
//		String str = null;
//		System.out.println("총 문자 수: " + str.length());

	}

}
