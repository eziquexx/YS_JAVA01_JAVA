package ch08.sec08;

public class Radio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Radio on");

	}

	@Override
	public void turnOff() {
		System.out.println("Radio off");

	}

}
