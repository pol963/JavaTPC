import kr.tpc.Animar;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {

		//�ڵ�����ȯ 
		Animar ani = new Cat();
		ani.eat(); //�����Ͻÿ��� Animar�� ?�� ����Ű�� �������� ������ ����ÿ��� Cat�� ���ġ���ӸԴٰ� ���� -> override
		
		//ani�� �̿��ؿ� night�޼ҵ带 ȣ���غ���.
		Cat c_ani = (Cat)ani;
		c_ani.night();
		
		//�ٿ��� ����غ���.
		//Downcasting
		((Cat)ani).night(); //���� �ٱ���ȣ�� ���ٸ� .�����ڰ� �켱�Ǳ⿡ ĳ������ ���ھʰ� ani.night�� �ν��ϱ⿡ ������ ���ɴϴ�.
		
		
		//�������̶� ����Ŭ�������� ����Ŭ�������� ���� �䱸�� �޾Ƶ� �ٸ� ������ �ϴ°��� �������̶�� �մϴ�.
		System.out.println("--------------------------");
		
		//ObjectŬ������ ���.
		Object o = new Dog();
		//o.eat(); //�и� �θ��ڽ�Ŭ������ ������ ObjectŬ������ ���������� �ʾұ⿡eat�޼��尡 �����ϴ�.
		((Dog)o).eat(); //��������ȯ
		
		Dog od = (Dog)o;
		od.eat();
		
		
	}

}
