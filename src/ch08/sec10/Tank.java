package ch08.sec10;

public class Tank implements Vehicle {

	@Override
	public void run() {
		System.out.println("탱크가 달린다.");
	}
	
	public void cannon() {
		System.out.println("탱크에서 대포가 발사됩니다.");
	}

}
