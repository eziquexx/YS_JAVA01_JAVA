package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		//길이 3인 배열
		int[] oldIntArray = { 1, 2, 3 };
		//길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		//배열 항목 복사
		for(int i=0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; //i번 그대로 값 복
		}
		//배열 항목 출력
		for(int i=0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", "); //배열을 5개로 생성했다보니 oldIntArray값 3개만 복사하고 나머지는 0으로 처리.
		}

	}

}
