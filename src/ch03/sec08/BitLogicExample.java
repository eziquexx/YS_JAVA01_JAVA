package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25)); // 45는 101101, 25는 11001
		// 45를 2진수로 표현하면: 00101101
		// 25를 2진수로 표현하면: 00011001
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("----------------------------");
		
		byte receiveData = -120;
		
		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//방법2: 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);

	}

}
