import java.awt.*;

import javax.swing.*;

public class Project01_F {
	JTextField address;
	JLabel resAddress, resX, resY, jibunAddress;
	JLabel imageLabel;
	public void initGUI() {
        JFrame frm=new JFrame("Map View");	//jFrame -> gui의 일종.	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x를 누르면 프레임이 닫히게 함.
		
		//jframe. 즉 창 안에 여러 컴포넌트들을 넣을 수 있는데 이러한 컴포넌트들을 부착할 수 있는 공간을 컨테이너 라고 합니다.
		Container c = frm.getContentPane();  //frm은 프레임 getContentPane메서드를 이용해서 부착할 수 있는 공간을 만듬.
		imageLabel = new JLabel("지도보기");
		
		JPanel pan=new JPanel(); //패널 성생
		JLabel addressLbl = new JLabel("주소입력"); // 상단부분 라벨 설정
		address=new JTextField(50); //주소입력 부분의 텍스트 필드 생성
		JButton btn=new JButton("클릭"); // 주소 입력후 넘겨줄 버튼 생성
		
		pan.add(addressLbl); //패널에 주소입력 추가.
		pan.add(address);// 패널에 텍스트필드 추가.
		pan.add(btn); // 패널에 버튼 추가.
		btn.addActionListener(new NaverMap(this));	//버튼을 누를시 이벤트 추가.
		
		JPanel pan1=new JPanel(); //패널 생성
		pan1.setLayout(new GridLayout(4, 1)); //레이아웃 4행 1열 
		resAddress = new JLabel("도로명"); //패널에 라벨생성
		jibunAddress = new JLabel("지번주소");
		resX = new JLabel("경도");
		resY = new JLabel("위도");
		
		pan1.add(resAddress); //패널에 추가
		pan1.add(jibunAddress);
		pan1.add(resX);
		pan1.add(resY);	
		
		c.add(BorderLayout.NORTH, pan); //위치지정 pan 패널은 위쪽
		c.add(BorderLayout.CENTER, imageLabel); //위치지정 imageLabel 가운대.
		c.add(BorderLayout.SOUTH, pan1); // pan1은 아래쪽.
		
		frm.setSize(730,660); //가로 세로
		frm.setVisible(true);//
	}
	
	
	
	public static void main(String[] args) {
		//실제 사용을 위한 객체 생성. -> static키워드가 없기에 따로 static메모리에 올려저 있지 않습니다. 따라서 직접 메모리에 올려줘야 합니다. new키워드.
		//이후 도트접근자를 이용하여 따로 접근.
		new Project01_F().initGUI();
		
		
	}

}
