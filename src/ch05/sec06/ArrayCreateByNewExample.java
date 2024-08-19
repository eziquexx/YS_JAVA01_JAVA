package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] arr1 = new int[3];
		
		//배열 항목의 초기값 출력
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		
		//배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		//배열 항목의 변경 값 출력
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", " );
		}
		System.out.println("\n");
		
		//배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
		
		//배열 항목의 초기값 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		
		//배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		//배열 항목의 변경 값 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
		//배열 변수 선언과 배열 생성
		String[] arr3 = new String[3];
		
		//배열 항목의 초기값 총력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		
		//배열 항목의 값 변경
		arr3[0] = "토끼";
		arr3[1] = "거북이";
		arr3[2] = "고양이";
		
		//배열 항목의 변경값 출력
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println("----------------------");
		
		System.out.printf("arr3 : %s\n", System.identityHashCode(arr3));
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + System.identityHashCode(arr3[i]));
		}
		
		System.out.println("----------------------");
		arr3[0] = "카멜레온";
		arr3[1] = "토끼"; //같은 내용이 있었던 것을 참조
		arr3[2] = "토끼2"; //문자열 값이 다르기 때문에 다른 주소 할당.
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + System.identityHashCode(arr3[i]));
		}
	}
}
