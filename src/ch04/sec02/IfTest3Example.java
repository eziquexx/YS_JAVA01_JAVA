package ch04.sec02;

import java.util.Scanner;

public class IfTest3Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		int num2 = num / 10;
		// 점수받기.
		// 90점~80점
		
		switch(num2) {
			case 10:
				System.out.println("만점!");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
		
		}
	}

}
