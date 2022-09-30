package 배열응용;

import java.util.Random;

public class 랜덤한값배열에넣기 {

	public static void main(String[] args) {
		// 1000개 테이더 넣을 공간 만들기
		int[] lotto = new int[6];
		
		//랜덤한 값 만들어주는 부품 만들기
		Random r = new Random();
		
		//반복문으로 랜덤한 값 100개 만들어서 
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(32) + 1; //최소값1 최댓값 32
		}
		//저장공간에 프린트해보자
		
		for (int x : lotto) {
			System.out.println(x + " ");
		}
	}

}
