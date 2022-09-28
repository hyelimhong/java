package 반복문;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int front = 0;
		int back =0;
		while (true) {
			System.out.print("숫자입력1>> ");
			int n1 = sc.nextInt();
			System.out.print("숫자입력2>> ");
			int n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				front = front + 1;
				
			} else if (n1 == n2) {
				System.out.println("숫자가 동일함.");
			} else {
				System.out.println("뒷 숫자가 더 큽니다.");
				back = back + 1;
				
			} 
			System.out.println("더하시겠습니까? 종료(x), 계속(o)>>");
			String exit = sc.next();
			char exit2 = exit.charAt(0); //첫번째 글자 문자 1개를 가지고 와라
			if (exit2 == 'x') {
				System.out.println("게임을 종료합니다.");
				System.out.println("앞이 큰 경우는 " + front);
				System.out.println("뒤가 큰 경우 " + back);
				System.exit(0);
			}
		}
	}

}
