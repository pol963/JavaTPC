import kr.tpc.Animar;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	//��ӿ� ���� Ŭ������ ����ϴ� ���
	public static void main(String[] args) {

		//Ȯ�强�� ���� ��ü���� ��� -> ��ӿ� ����.
		Animar ani = new Dog(); //UpCasting
		ani.eat();
		
		
		ani = new Cat();
		ani.eat();
		/* ����ȯDownCasting
		Cat NC = (Cat)ani; 
		NC.night();
		*/
		
		//���� ������ ���ٷ� ���� �ڵ�.
		((Cat)ani).night();
		
	}

}

/*
 	DogŬ���� CatŬ������ AnimarŬ������ �θ�εΰ��ִ� �ڽ� Ŭ�����̴�.
 	�θ�Ŭ������ �ڽ�Ŭ���� �ѿ��� ���� ������ �䱸�Ѵ� -> eat
 	�̶� �ڽ�Ŭ���� ���� ���� ������ �䱸�� �ٸ� ������ ���δ�. �� ��ó���Դ�,�����ó�� �Դ� �� �����Ѵ�.
 	�̷��� ���� �䱸�� �ٸ� ������ ���̴°��� ������ �̶�� �մϴ�.
*/





