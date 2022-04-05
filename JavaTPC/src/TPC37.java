import kr.infrine.ObjectArray;
import kr.tpc.*;

public class TPC37 {

	public static void main(String[] args) {

		ObjectArray oArr = new ObjectArray(5);
		oArr.add(new A()); // object타입의 데이터이기에 뭐든 넣을 수 있습니다. -> 다른객체또한 가능.
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
