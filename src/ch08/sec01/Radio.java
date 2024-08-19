package ch08.sec01;

public class Radio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("라디오가 켜졌습니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("라디오가 꺼졌습니다.");

	}

	int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			RemoteControl.super.setMute(mute);			
		} else {
			this.volume = this.memoryVolume;
			RemoteControl.super.setMute(mute);			
		}
	}

	@Override
	public void setVolume(int volume) {
		if (volume < this.MIN_VOLUMN) {
			this.volume = this.MIN_VOLUMN;
		} else if (volume > this.MAX_VOLUMN) {
			this.volume = this.MAX_VOLUMN;
			System.out.println("최대 볼륨은"+this.MAX_VOLUMN+"까지 입니다.\n입력하신 볼륨은 최대치를 넘었기 때문에 최대볼륨 값인"+this.MAX_VOLUMN+"값으로 출력됩니다.");
		} else {
			this.volume = volume;
		}
	}
	
	public void printVolume() {
		System.out.println("라디오 볼륨: " + volume);		
	}

}
