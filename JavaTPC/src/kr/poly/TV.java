package kr.poly;

// implements Remocon -> 상속받았으며 필수적으로 재정의를 해줘야 합니다.
public class TV implements RemoCon{
	
	int currCH=70;

	@Override
	public void chUp() {
		if(currCH<MaxCh) {
			currCH++;
		System.out.println("tv의 채널이 올라간다." + currCH);
		}else {
			currCH=1;
			System.out.println("tv의 채널이 올라간다." + currCH);
		}
	}

	@Override
	public void chDown() {
		if(currCH > MinCh) {
			currCH--;
		System.out.println("tv의 채널이 내려간다." + currCH);
		
		}else {
			currCH=100;
			System.out.println("tv의 채널이 내려간다." + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("Tv의 인터넷이 작동된다.");
	}

}
