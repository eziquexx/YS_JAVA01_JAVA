package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	int charCode = 'A'; //65 A~Z의 코드는 6~90
		//int charCode = 'a'; //97 a~z의 코드는 97~122
		//int charCode = '5'; //53  0~9의 코드는 48~57
		
		if( (65 <= charCode) & (charCode <= 90) ) {
			System.out.println("대문자이군요.");
		}
		
		if( (97 <= charCode) && (charCode <= 122) ) {
			System.out.println("소문자이군요.");
		}
		
		if( (48 <= charCode) && (charCode <= 57) ) {
			System.out.println("0~9 숫자이군요.");
		}

		
		//--------------------------------------------------------
		
		int value = 6;
//		int value = 7; // value 를 7로 하면 밑에 2, 3의 배수 아니라고 출력
		
		if( (value%2 == 0) | (value%3 == 0) ) { // 0 == 0 , 0 == 0 둘다 true
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value % 2 == 0) || (value % 3 == 0); // 둘다 true
		if (!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
		
	}

}
