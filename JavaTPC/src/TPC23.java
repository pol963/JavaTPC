import kr.tpc.*;

public class TPC23 {
	
	//������ �̷� �ǽ�. 	
	public static void main(String[] args) {
		
		//1.������ �μ� -> �Ű������� ����Ÿ���� �θ��� Ÿ������ �ϸ� �ڽ� ��ü���� ���� �� �ֽ��ϴ�. -> �޼ҵ带 ������ ����°��� �����ϰ� ����.
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
		
		
		
	}
	
	
	//�������μ� -> �θ��ڷ������� �ڽ� �ڷ����� �ٹ޴°� -> display���ڿ� �� Dog d, Cat c�� �ѹ��� ���ɴϴ�. 
	public static void display(Animar r) { //�̋� r�� �ڵ� UpCasting 
		 r.eat();
		 
		 //instanceof -> ��üŸ��Ȯ�� ������ -> ����ȯ���θ� Ȯ���Ͽ� t or f �� ��ȯ���ݴϴ�.
		 if(r instanceof Cat) { //r�� CatŸ������ �����ٸ� True �ƴϸ� False
			 ((Cat)r).night(); //DownCasting
		 }
		 
	}

}
