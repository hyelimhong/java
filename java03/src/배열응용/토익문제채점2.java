package 배열응용;

import java.util.Random;

public class 토익문제채점2 {

	public static void main(String[] args) {
		// 1.답안지 내답안 공간
		int[]답안지 = new int[990];
		int[]내답안 = new int[990];
		
		//2.랜덤하게 만들어주는 부품을 만들어라
		Random r = new Random();
		
		//3.990번 반복해서 답안지, 대답 안에 숫자를 넣어라 1-4범위
		for (int i = 0; i < 내답안.length; i++) {
			 답안지[i] = r.nextInt(4) + 1;
			 내답안[i] = r.nextInt(4) + 1;
		}
		
		System.out.println("  답안지   :    내답안  ");
		for (int i = 0; i <  답안지.length; i++) {
			System.out.println("   " + 답안지[i] + "            " +  내답안[i]);
		}
		
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jumsu++;
			}
		}
		System.out.println("내 점수 :  " + jumsu + "점");
	} 
	

}
