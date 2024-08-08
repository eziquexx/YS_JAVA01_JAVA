package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); // 키보드 입력값을 받겠다.
		
		System.out.print("x값 입력: "); // 화면에 출력할 값
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("값 입력: "); // 화면에 출력할 값
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
//		int result = x + y;
//		System.out.println("x + y: " + result);
//		System.out.println();
		
		
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %.2f\n", x, y, (double)x/y);
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		

	}

}
