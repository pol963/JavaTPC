import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
		
		Animar ani = new Dog();
		ani.eat(); //�����϶� Animar eat() -> ����� Dog eat() �ڽ��� �θ��� eat�� �������̵�
		ani.Move();
		
		
		ani = new Cat();
		ani.eat(); //�����Ͻ� Animar eat() -> ����� Cat eat() �ڽ��� �θ��� eat�� �������̵�
		ani.Move();
		((Cat)ani).night();
		
	}

}


/*
 	��� �׸��� ������ �׸��� �������� ����.
 	�������� ������ �������̽��� ���
  
  
 */



