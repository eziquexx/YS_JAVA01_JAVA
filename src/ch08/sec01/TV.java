package ch08.sec01;

public class TV implements RemoteControl {
	private int volume;

	@Override //재정의
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다.");
	}

	@Override //재정의
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다.");

	}
	
	int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume; //묵음요청이면 현재 볼륨을 임시 저장
			RemoteControl.super.setMute(mute); //현재볼륨을 최소값(0)으로
		} else {
			this.volume = this.memoryVolume; //임시저장 볼륨값을 현재볼륨값으로 
			RemoteControl.super.setMute(mute); //묵음해제하기 호출
		}
		
	}

	@Override //재정의
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
		System.out.println("TV 볼륨: " + volume);	
	}
}
