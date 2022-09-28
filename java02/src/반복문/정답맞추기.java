package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
//		int target = 88;
		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0; //int는 0으로 초기화
		int fail = 0;
		//누적시켜주는 변수 선언은 반복문 안에 넣지 않는다
		
		while (true) { //무한루프
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1; // count++; (증감연산자)
			fail = count - 1;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다."); //57
				//무한루프를 반드시 끝내는 처리를 해야함
				//break; // while의 break
				System.out.println("전체 시도 횟수는 " + count);
				System.out.println("전체 틀린 횟수는 " + fail);
				System.exit(0); //정답맞추기 게임 프로그램 자체를 종료
			} else {
				System.out.println("정답이 아닙니다.");
				//내가 넣은 값이 정답보다 큰지 아닌지 힌트를 알려주는 기능
				
				if (data2 > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
				
				
			} 
		}
		//JOptionPane.showMessageDialog(null, "다음에 방문해주세요");
	}
	
}
