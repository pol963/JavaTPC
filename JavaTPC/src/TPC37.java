import kr.infrine.ObjectArray;
import kr.tpc.*;

public class TPC37 {

	public static void main(String[] args) {

		ObjectArray oArr = new ObjectArray(5);
		oArr.add(new A()); // objectŸ���� �������̱⿡ ���� ���� �� �ֽ��ϴ�. -> �ٸ���ü���� ����.
		oArr.add(new B());
		oArr.add(new A());
		oArr.add(new B());
		oArr.add(new A());

		for (int i = 0; i < oArr.size(); i++) {

			Object o = oArr.get(i);

			if (o instanceof A) {
				((A) o).go();
			} else {
				((B) o).go();
			}

		}

	}

}
