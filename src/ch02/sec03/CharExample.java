package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A'+1;		//문자 저장
		char c2 = 65+1;		//유니코드 직접 저장
		
		char c3 = '가';		//문자 저장
		char c4 = 0xAC00;	//유니코드 직접 저장 44032
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
