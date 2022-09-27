package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		String skt = JOptionPane.showInputDialog("통신사 입력: ");
		String tel = JOptionPane.showInputDialog("전화번호 입력: ");
		String name = JOptionPane.showInputDialog("가입자이름 입력: ");
		
		String link  = skt + "은" + tel + "에";
		JOptionPane.showMessageDialog(null,  name + "님은 " + skt + "에 " + tel + "로 가입되셨습니다.");
	
	}

}
