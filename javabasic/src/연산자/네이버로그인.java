package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인 {

	public static void main(String[] args) {
		// 기본형 비교 여러개인 경우
		// 가입했을 때 id pw
		//db에 저장돼있는 값을 db에서 꺼내와야함
		int id = 1111;
		int pw = 2222;
		
		//입력한 id/pw
		int id2 = 1111;
		int pw2 = 3222;
		
		
		//논리연산자
		
		
		if (id == id2 && pw == pw2 ) { //기본형은 연산자를 이용해서 값을 비교할 수 있다.
			System.out.println("로그인 성공");
			
		} else { //else 뒤에는 () 쓰지않음
			System.out.println("로그인 실패");

		}
		
		
	}

}
