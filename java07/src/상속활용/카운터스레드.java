package 상속활용;

import javax.swing.JOptionPane;

public class 카운터스레드 extends Thread {

	@Override
	public void run() {
		for (int j = 20; j >= 0; j--) {
			System.out.println("카운트>> " + j);
		}
		//cpu가 한꺼번에 너무 많이 실행해버려서 다른 스레드랑 동시에 처리되는 것처럼 보이지 않는다
		//1초 쉬었다가 일하라는 설정 1000 = 1초
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//자바프로그램에서 외부자원(cpu, db, network, file)을 연결할 때는
		//프로그램이 중단되는 위험한 상황으로 인식되어 
		//그런 상황이 생겼을 때 어떻게 할지를 반드시 !! 써주어야함
		//예외처리
		
		
		int j = 0;
		if(j == 0) {
			JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실하여주세요.");
		}
		
	}
		
}
