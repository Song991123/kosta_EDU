package ex0213_송정현.interface_ex.sec06;
/**
 * 작성일 : 0216
 * 내용 : 344~360p 실습
 * */
public class Television implements RemoteControl {
	// 필드
	private int volume;
	
	// turnON 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	// turnOff 추상메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	//setVolume() 추상메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
