package kr.poly;

// implements Remocon -> ��ӹ޾����� �ʼ������� �����Ǹ� ����� �մϴ�.
public class TV implements RemoCon{
	
	int currCH=70;

	@Override
	public void chUp() {
		if(currCH<MaxCh) {
			currCH++;
		System.out.println("tv�� ä���� �ö󰣴�." + currCH);
		}else {
			currCH=1;
			System.out.println("tv�� ä���� �ö󰣴�." + currCH);
		}
	}

	@Override
	public void chDown() {
		if(currCH > MinCh) {
			currCH--;
		System.out.println("tv�� ä���� ��������." + currCH);
		
		}else {
			currCH=100;
			System.out.println("tv�� ä���� ��������." + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("Tv�� ���ͳ��� �۵��ȴ�.");
	}

}
