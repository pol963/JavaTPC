import kr.tpc.*;

public class TPC24 {
	
	//������ �迭 -> �迭�� Ÿ���� �θ��� �ڷ���Ÿ������ ����� �ڽ� ��ü���� �迭�ȿ� ���� �� �ֽ��ϴ�. ->�迭 �ȿ��� ������ ��üŸ�Ը� ���� �� �ִ�.
	//ex) Dog �� Dog�� Cat�� Cat�� or int�� int�� ......
	public static void main(String[] args) {
		
		//Dog�� Cat�� �� �迭�� �����غ���.
		Animar[] ani = new Animar[2];
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i = 0; i < ani.length;i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}//for
		
		
		System.out.println();
		System.out.println();
		
		display(ani);
		
	}

	//���� ������ �޼ҵ�� �ڵ��Ѱ�.
	private static void display(Animar[] ani) { //������ �迭.
		for(int i = 0; i < ani.length;i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}
	}

}
