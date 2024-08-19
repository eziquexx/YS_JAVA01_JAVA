package ch04.sec02;

import java.util.Scanner;

public class SwitchTest2Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		int num2 = num / 10;
		// 점수받기.
		// 90점~80점
		
		switch(num2) {
			case 10, 9 -> {
				System.out.println("A");}
			case 8 -> {
				System.out.println("B");}
			case 7 -> {
				System.out.println("C");}
			case 6 -> {
				System.out.println("D");}
			default -> {
				System.out.println("F");}
		
		}
	}

}
