package ch08.sec01;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RemoteControl이 부모로부터 상속받은 것이기 때문에
		//new TV();를 사용이 가능한 것이다.
		RemoteControl rct = new TV(); 
		rct.turnOn();
		rct.turnOff();
		System.out.printf("TV의 최대볼륨:%d, TV의 최소볼륨:%d\n", RemoteControl.MAX_VOLUMN, RemoteControl.MIN_VOLUMN);
		
		rct.setVolume(5);
		TV tv = (TV)rct; 
		tv.printVolume();
		
		rct.callPrivateFunc();
		RemoteControl.callPrivateStaticFunc();
		
		System.out.println("---------------------------");
		
		rct.setMute(true);
		tv.printVolume();
		rct.setMute(false);
		tv.printVolume();
		
		RemoteControl.changeBattery();
		
		System.out.println("---------------------------");
		
		rct = new Radio();
		rct.turnOn();
		rct.turnOff();
		System.out.printf("Radio의 최대볼륨:%d, Radio의 최소볼륨:%d\n", RemoteControl.MAX_VOLUMN, RemoteControl.MIN_VOLUMN);
		
		rct.setVolume(50);
		Radio rdo = (Radio)rct; 
		rdo.printVolume();
		
		rct.setMute(true);
		rdo.printVolume();
		rct.setMute(false);
		rdo.printVolume();
	
	}

}
