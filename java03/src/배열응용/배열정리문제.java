package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자입력>>");
			s[i] = sc.nextInt();
			
		}
		System.out.println(s[0] + s[2]);

	}
	

}
