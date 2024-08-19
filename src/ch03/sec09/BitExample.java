package ch03.sec09;

public class BitExample {

	public static void main(String[] args) {
		//					 76543210
		byte leds = (byte) 0b10101101;
		
		for(int index = 0 ; index < 8 ; index++) {
			byte chk_led = (byte) (1 << index);
			if((leds & chk_led) == chk_led) {
				System.out.printf("%d램프가 On 입니다.\n", index);
			} else {
				System.out.printf("%d램프가 Off 입니다.\n", index);			
			}			
		}
		
	}

}
