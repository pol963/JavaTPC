import kr.tpc.Animar;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {

		//AnimarŬ������ ������� ���� ��� -> DogŬ������ CatŬ������ ��������� ��� �޼ҵ尡 �ִ��� �� �� �� ������
		
		Dog d = new Dog();
		d.eat();//Animar�� eat�޼��� �Դϴ�. Dog(�ڽ�)Ŭ������ Animar(�θ�)Ŭ������ ��ӹ޾ұ⿡ ����� �����մϴ�.
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		
		//Dog.java �� Cat.java �ҽ������� ������ -> ���������� Ŭ�������ϸ��� �޾����� Dog�� Cat�� ��� �޼ҵ尡�ִ��� �𸦋�.
		Animar ani = new Dog(); //Upcasting(�ڵ�����ȯ)�� ���� �θ��ڽİ��� Ÿ���� �ȸ¾Ƶ� ����� �����մϴ�.
		ani.eat(); //�̶� ���������� �и� Animar�� eat�� ����Ű�������� ����ÿ��� �������̵忡 ���� �θ��� �޼���� �������̵�� �ڽ��� �޼ҵ带 ã�ư��� �����Ų��.
		
		ani = new Cat();
		ani.eat();
		
		
		//�߿������� Dog�� Cat�� ���� �޼ҵ带 ���� ������� ���� Animar���� �������̵�� Dog�޼ҵ带 ��밡���ϴٴ� ���̴�.
		
		//ani�� �θ�Ÿ���̳� �ڽ�Ÿ������ �ٿ�ĳ������ �� �� �Դϴ�. -> ��������ȯ
		((Cat)ani).night();
		
		
		
		
		
		
		
	}

}
