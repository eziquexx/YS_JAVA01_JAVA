package ch05.sec12;

import java.util.Calendar;

enum Day { Mon, Tue, Wed, Thu, Fri, Sat, Sun }

enum TracfficLight { RED, YELLOW, GREEN }
public class WeekExample {

	public static void main(String[] args) {
		
		Day today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//1: 일요일, 2: 월요일 ~ 7: 토요일
		switch(week) {
		case 1: 
			today = Day.Sun;
			break;
		case 2: 
			today = Day.Mon;
			break;
		case 3: 
			today = Day.Tue;
			break;
		case 4: 
			today = Day.Wed;
			break;
		case 5: 
			today = Day.Thu;
			break;
		case 6: 
			today = Day.Fri;
			break;
		case 7: 
			today = Day.Sat;
			break;
		}
		
		
//		Day today = Day.Fri;
//		System.out.println("오늘은 " + today + "입니다.");
//
//		switch(today) {
//		case Mon: 
//			System.out.println("월요일은 원래 마시는 날");
//			break;
//		case Tue: 
//			System.out.println("화요일은 홧김에 마시는 날");
//			break;
//		case Wed: 
//			System.out.println("수요일은 물 대신 마시는 날");
//			break;
//		case Thu: 
//			System.out.println("목요일은 목 말라 마시는 날");
//			break;
//		case Fri: 
//			System.out.println("금요일은 불금이라 마시는 날");
//			break;
//		case Sat: 
//			System.out.println("토요일은 토할 때까지 마시는 날");
//			break;
//		case Sun: 
//			System.out.println("일요일은 토할 때까지 마시는 날");
//			break;
//		}
		
//		TracfficLight light = TracfficLight.YELLOW;
//		switch(light) {
//		case RED:
//			System.out.println("멈추세요");
//			break;
//		case YELLOW:
//			System.out.println("멈출 준비 하세요");
//			break;
//		case GREEN:
//			System.out.println("지나가도 됩니다");
//			break;
//		}
	}

}
