package 변수;

import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		// 자주쓰는 기능을 가진 부품은 대문자로 바꿀수있게 되어있음
		// 취미, 이름 입력 ==> 출력
		//입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요");
		String hobby = JOptionPane.showInputDialog("딩신의 취미를 입력하세요");
		String name = JOptionPane.showInputDialog("딩신의 이름을 입력하세요");
		//자주 안쓰는 기능을 가진 부품은 new를 가지고 새로 만들어쓴다
		//alert()
		JOptionPane.showMessageDialog(null, "나의 나이는" + age);
		JOptionPane.showMessageDialog(null, "나의 취미는" + hobby);
		JOptionPane.showMessageDialog(null, "나의 이름은" + name);
		

	}

}
