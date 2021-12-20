package co.micoltv;

public class LgTV implements RemoteControl {

	public LgTV() {
		System.out.println("LgTV 객체생성");
	}

	public void powerOn() {
		System.out.println("Lg TV--전원 on");
	}

	public void powerOff() {
		System.out.println("Lg TV--전원 off");
	}

	public void volumeUp() {
		System.out.println("Lg TV--볼륨 on");
	}

	public void volumeDown() {
		System.out.println("Lg TV--볼륨 dawn");
	}

}
