package javabasic;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		//입력
		String w = JOptionPane.showInputDialog("가로크기");
		String h = JOptionPane.showInputDialog("세로크기");
		//처리
		
		int width = Integer.parseInt(w);
		int height = Integer.parseInt(h);
		int total = width * height;
		//기본형 아닌 애들은 곱하기 나누니 여산이 불가능하다
		//정수로 바꿔야함 ==> 해당 부품 찾아야함 Interger
		//실수로 바꾸는건 double
		//산술 : 숫사여야함
		//결합 : 더해지는 값들 중 하나라도 string이면 무조건 결합! 결과도 무조건 결합
		//출력
		//모니터 system.out 메세지 joptionPane 
		JOptionPane.showInputDialog(null,"사각형의 면적은" + total);
	}

}
