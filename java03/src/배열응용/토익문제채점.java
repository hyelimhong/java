package 배열응용;

import java.util.Random;

public class 토익문제채점 {

	public static void main(String[] args) {
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		
		Random r = new Random();
		
		
		//990번을 반복해라
		for (int i = 0; i < 답안지.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
		}
		System.out.println("문항번호: 답안  내답");
		System.out.println("----------");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i + 1 + ": " + 답안지[i] + "   " +내답안[i]);
		}
		
		//채점해보자
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jumsu++; 
			}
		} //990번 반복 후 끝
		System.out.println(jumsu);
	}

}
